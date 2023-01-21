package com.example.electric_storage.infrastructure.diode.normal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
class DiodeRepositoryImpl implements DiodeRepository {
  private final DiodeJpaRepository repository;

  @Override
  public Collection<DiodeEntity> getDiodes() {
    return repository.findAll();
  }

  @Override
  public Optional<DiodeEntity> getDiodeByUniqueId(String uniqueId) {
    return repository.findByUniqueId(uniqueId);
  }

  @Override
  public void addDiode(DiodeEntity entity) {
    repository.save(entity);
  }
}
