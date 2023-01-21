package com.example.electric_storage.infrastructure.inductor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
class InductorRepositoryImpl implements InductorRepository {

  private final InductorJpaRepository jpaRepository;

  @Override
  public Collection<InductorEntity> getInductors() {
    return jpaRepository.findAll();
  }

  @Override
  public Optional<InductorEntity> getInductorByUniqueId(String uniqueId) {
    return jpaRepository.findByUniqueId(uniqueId);
  }

  @Override
  public void save(InductorEntity entity) {
    jpaRepository.save(entity);
  }
}
