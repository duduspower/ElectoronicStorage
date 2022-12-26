package com.example.electric_storage.domain.resistor;

import com.example.electric_storage.infrastructure.resistor.ResistorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResistorServiceImpl implements ResistorService {

  private final ResistorRepository repository;
  private final ResistorMapper mapper;

  @Override
  public List<Resistor> getResistors() {
    var resistors = repository.getResistors();
    return resistors.stream().map(mapper::toResistor).toList();
  }

  @Override
  public void addResistor(Resistor resistor) {
    repository.addResistor(resistor);
  }
}
