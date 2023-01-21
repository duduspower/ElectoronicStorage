package com.example.electric_storage.domain.diode.led;

import com.example.electric_storage.infrastructure.diode.led.LedDiodeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LedDiodeServiceImpl implements LedDiodeService {

  private final LedDiodeRepository repository;
  private final LedDiodeMapper mapper;

  @Override
  public Collection<LedDiode> getLedDiodes() {
    return repository.getLedDiodes().stream().map(mapper::toDomain).toList();
  }

  @Override
  public LedDiode getLedDiodeByUniqueId(String uniqueId) {
    var diode = repository.getLedDiodeByUniqueId(uniqueId);
    if (diode.isPresent()) return mapper.toDomain(diode.get());
    throw new EntityNotFoundException("Led Diode for given unique id not found");
  }

  @Override
  public void addLedDiode(LedDiode diode) {
    repository.addLedDiode(
        mapper.toEntity(diode.toBuilder().uniqueId(UUID.randomUUID().toString()).build()));
  }
}
