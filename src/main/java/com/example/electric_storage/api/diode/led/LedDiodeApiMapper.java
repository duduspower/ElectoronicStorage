package com.example.electric_storage.api.diode.led;

import com.example.electric_storage.domain.diode.led.LedDiode;
import org.mapstruct.Mapper;

@Mapper
public interface LedDiodeApiMapper {

  LedDiodeResponse toResponse(LedDiode domain);

  LedDiode toDomain(LedDiodeRequest request);
}
