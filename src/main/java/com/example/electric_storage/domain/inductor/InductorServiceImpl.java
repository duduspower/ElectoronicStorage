package com.example.electric_storage.domain.inductor;

import com.example.electric_storage.infrastructure.inductor.InductorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class InductorServiceImpl implements InductorService {

  private final InductorRepository repository;
  private final InductorMapper mapper;

  @Override
  public Collection<Inductor> getInductors() {
    var inductors = repository.getInductors();
    return inductors.stream().map(mapper::toDomain).toList();
  }

  @Override
  public Inductor getInductorByUniqueId(String uniqueId) {
    var inductor = repository.getInductorByUniqueId(uniqueId);
    if (inductor.isPresent()) return mapper.toDomain(inductor.get());
    throw new EntityNotFoundException("Inductor for given id not found");
  }

  @Override
  public void addInductor(Inductor inductor) {
    repository.save(mapper.toEntity(inductor));
  }
}
