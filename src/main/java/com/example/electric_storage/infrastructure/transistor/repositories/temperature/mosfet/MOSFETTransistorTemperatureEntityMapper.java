package com.example.electric_storage.infrastructure.transistor.repositories.temperature.mosfet;

import com.example.electric_storage.domain.transistor.model.temperature.jfet.JFETTransistorTemperature;
import com.example.electric_storage.infrastructure.transistor.model.temperature.JFETTransistorTemperatureEntity;
import org.mapstruct.Mapper;

@Mapper
interface MOSFETTransistorTemperatureEntityMapper {

    JFETTransistorTemperature toDomain(JFETTransistorTemperatureEntity entity);

    JFETTransistorTemperatureEntity toEntity(JFETTransistorTemperature domain);

}
