package com.example.electric_storage.domain.diode.normal;

import com.example.electric_storage.infrastructure.diode.normal.DiodeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DiodeMapper {

  DiodeEntity toEntity(Diode domain);

  Diode toDomain(DiodeEntity entity);
}
