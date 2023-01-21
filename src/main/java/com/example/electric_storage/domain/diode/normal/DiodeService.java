package com.example.electric_storage.domain.diode.normal;

import java.util.Collection;

public interface DiodeService {
  Collection<Diode> getDiodes();

  Diode getDiodeByUniqueId(String uniqueId);

  void addDiode(Diode domain);
}
