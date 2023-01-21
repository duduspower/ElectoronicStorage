package com.example.electric_storage.domain.diode.normal;

import com.example.electric_storage.infrastructure.diode.normal.DiodeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DiodeServiceImpl implements DiodeService {

  private final DiodeRepository repository;
  private final DiodeMapper mapper;

  @Override
  public Collection<Diode> getDiodes() {
    return repository.getDiodes().stream().map(mapper::toDomain).toList();
  }

  @Override
  public Diode getDiodeByUniqueId(String uniqueId) {
    var diode = repository.getDiodeByUniqueId(uniqueId);
    if (diode.isPresent()) return mapper.toDomain(diode.get());
    throw new EntityNotFoundException("Diode for given unique id not found");
  }

  @Override
  public void addDiode(Diode domain) {
    repository.addDiode(
        mapper.toEntity(domain.toBuilder().uniqueId(UUID.randomUUID().toString()).build()));
  }
}
