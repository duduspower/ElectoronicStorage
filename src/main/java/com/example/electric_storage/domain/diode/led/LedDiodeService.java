package com.example.electric_storage.domain.diode.led;

import java.util.Collection;

public interface LedDiodeService {

  Collection<LedDiode> getLedDiodes();

  LedDiode getLedDiodeByUniqueId(String uniqueId);

  void addLedDiode(LedDiode diode);
}
