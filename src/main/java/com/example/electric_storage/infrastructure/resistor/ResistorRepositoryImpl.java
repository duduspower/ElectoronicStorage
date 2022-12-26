package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.domain.resistor.Resistor;
import com.example.electric_storage.domain.resistor.ResistorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ResistorRepositoryImpl implements ResistorRepository {
  private final ResistorJpaRepository jpaRepository;
  private final ResistorMapper resistorMapper;

  @Override
  public List<ResistorEntity> getResistors() {
    return jpaRepository.findAll();
  }

  @Override
  public void addResistor(Resistor resistor) {
    jpaRepository.save(resistorMapper.toResistorEntity(resistor));
  }
}
