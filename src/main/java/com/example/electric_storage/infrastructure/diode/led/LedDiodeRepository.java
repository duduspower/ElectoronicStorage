package com.example.electric_storage.infrastructure.diode.led;

import java.util.Collection;
import java.util.Optional;

public interface LedDiodeRepository {

  Collection<LedDiodeEntity> getLedDiodes();

  Optional<LedDiodeEntity> getLedDiodeByUniqueId(String uniqueId);

  void addLedDiode(LedDiodeEntity entity);
}
