package com.example.electric_storage.infrastructure.transistor.repositories.temperature.bjt;

import com.example.electric_storage.domain.transistor.model.temperature.bjt.BJTTransistorTemperature;
import com.example.electric_storage.infrastructure.transistor.model.temperature.BJTTransistorTemperatureEntity;
import org.mapstruct.Mapper;

@Mapper
interface BJTTransistorTemperatureEntityMapper {

    BJTTransistorTemperature toDomain(BJTTransistorTemperatureEntity entity);

    BJTTransistorTemperatureEntity toEntity(BJTTransistorTemperature domain);

}
