package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.domain.resistor.Resistor;

import java.util.List;
import java.util.Optional;

public interface ResistorRepository {

  List<ResistorEntity> getResistors();

  Optional<ResistorEntity> getResistorByUniqueId(String uniqueId);

  void addResistor(Resistor resistor);
}
