package com.example.electric_storage.domain.resistor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResistorService {

  List<Resistor> getResistors();

  void addResistor(Resistor resistor);
}
