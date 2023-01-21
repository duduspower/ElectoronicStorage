package com.example.electric_storage.infrastructure.diode.led;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
class LedDiodeRepositoryImpl implements LedDiodeRepository {

  private final LedDiodeJpaRepository repository;

  @Override
  public Collection<LedDiodeEntity> getLedDiodes() {
    return repository.findAll();
  }

  @Override
  public Optional<LedDiodeEntity> getLedDiodeByUniqueId(String uniqueId) {
    return repository.findByUniqueId(uniqueId);
  }

  @Override
  public void addLedDiode(LedDiodeEntity entity) {
    repository.save(entity);
  }
}
