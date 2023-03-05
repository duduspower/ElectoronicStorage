package com.example.electric_storage.infrastructure.transistor.repositories.mosfet;

import com.example.electric_storage.domain.transistor.model.mosfet.MOSFETTransistor;
import com.example.electric_storage.infrastructure.transistor.model.MOSFETTransistorEntity;
import org.mapstruct.Mapper;

@Mapper
interface MOSFETTransistorEntityMapper {

    MOSFETTransistor toDomain(MOSFETTransistorEntity entity);

    MOSFETTransistorEntity toEntity(MOSFETTransistor domain);

}
