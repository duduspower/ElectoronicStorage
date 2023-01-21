package com.example.electric_storage.api.diode.normal;

import com.example.electric_storage.domain.diode.normal.Diode;
import org.mapstruct.Mapper;

@Mapper
public interface DiodeApiMapper {

  DiodeResponse toResponse(Diode diode);

  Diode toDomain(DiodeRequest request);
}
