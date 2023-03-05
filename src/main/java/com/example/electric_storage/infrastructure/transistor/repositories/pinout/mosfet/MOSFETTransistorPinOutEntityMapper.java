package com.example.electric_storage.infrastructure.transistor.repositories.pinout.mosfet;

import com.example.electric_storage.domain.transistor.model.pinout.mosfet.MOSFETTransistorPinOut;
import com.example.electric_storage.infrastructure.transistor.model.pinout.MOSFETTransistorPinOutEntity;
import org.mapstruct.Mapper;

@Mapper
interface MOSFETTransistorPinOutEntityMapper {

    MOSFETTransistorPinOut toDomain(MOSFETTransistorPinOutEntity entity);

    MOSFETTransistorPinOutEntity toEntity(MOSFETTransistorPinOut domain);
}
