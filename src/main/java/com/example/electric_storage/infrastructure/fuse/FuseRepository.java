package com.example.electric_storage.infrastructure.fuse;

import java.util.Collection;
import java.util.Optional;

public interface FuseRepository {

  Collection<FuseEntity> getFuses();

  Optional<FuseEntity> getFuseByUniqueId(String uniqueId);

  void addFuse(FuseEntity entity);
}
