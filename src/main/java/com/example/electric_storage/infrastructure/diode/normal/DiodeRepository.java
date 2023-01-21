package com.example.electric_storage.infrastructure.diode.normal;

import java.util.Collection;
import java.util.Optional;

public interface DiodeRepository {

  Collection<DiodeEntity> getDiodes();

  Optional<DiodeEntity> getDiodeByUniqueId(String uniqueId);

  void addDiode(DiodeEntity entity);
}
