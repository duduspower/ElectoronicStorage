package com.example.electric_storage.domain.resistor;

import com.example.electric_storage.infrastructure.resistor.ResistorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ResistorMapper {
  Resistor toResistor(ResistorEntity entity);

  ResistorEntity toResistorEntity(Resistor resistor);
}
