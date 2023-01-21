package com.example.electric_storage.infrastructure.fuse;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
class FuseRepositoryImpl implements FuseRepository {

  private final FuseJpaRepository repository;

  @Override
  public Collection<FuseEntity> getFuses() {
    return repository.findAll();
  }

  @Override
  public Optional<FuseEntity> getFuseByUniqueId(String uniqueId) {
    return repository.findByUniqueId(uniqueId);
  }

  @Override
  public void addFuse(FuseEntity entity) {
    repository.save(entity);
  }
}
