package com.example.electric_storage.infrastructure.inductor;

import java.util.Collection;
import java.util.Optional;

public interface InductorRepository {

  Collection<InductorEntity> getInductors();

  Optional<InductorEntity> getInductorByUniqueId(String uniqueId);

  void save(InductorEntity entity);
}
