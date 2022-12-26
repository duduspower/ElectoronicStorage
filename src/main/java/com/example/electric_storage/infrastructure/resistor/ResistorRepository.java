package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.domain.resistor.Resistor;

import java.util.List;

public interface ResistorRepository {

  List<ResistorEntity> getResistors();

  void addResistor(Resistor resistor);
}
