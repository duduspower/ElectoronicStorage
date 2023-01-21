package com.example.electric_storage.domain.diode.led;

import com.example.electric_storage.infrastructure.diode.led.LedDiodeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface LedDiodeMapper {

  LedDiode toDomain(LedDiodeEntity entity);

  LedDiodeEntity toEntity(LedDiode domain);
}
