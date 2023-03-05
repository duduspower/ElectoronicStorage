package com.example.electric_storage.infrastructure.transistor.repositories.pinout.jfet;

import com.example.electric_storage.domain.transistor.model.pinout.jfet.JFETTransistorPinOut;
import com.example.electric_storage.infrastructure.transistor.model.pinout.JFETTransistorPinOutEntity;
import org.mapstruct.Mapper;

@Mapper
interface JFETTransistorPinOutEntityMapper {

    JFETTransistorPinOut toDomain(JFETTransistorPinOutEntity entity);

    JFETTransistorPinOutEntity toEntity(JFETTransistorPinOut domain);

}
