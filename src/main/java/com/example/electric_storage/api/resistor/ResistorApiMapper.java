package com.example.electric_storage.api.resistor;

import com.example.electric_storage.domain.resistor.Resistor;
import org.mapstruct.Mapper;

@Mapper
public interface ResistorApiMapper {
  Resistor toDomain(ResistorRequest request);

  ResistorResponse toResponse(Resistor response);
}
