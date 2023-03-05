package com.example.electric_storage.infrastructure.transistor.repositories.jfet;

import com.example.electric_storage.domain.transistor.model.jfet.JFETTransistor;
import com.example.electric_storage.infrastructure.transistor.model.JFETTransistorEntity;
import org.mapstruct.Mapper;

@Mapper
interface JFETTransistorEntityMapper {

    JFETTransistor toDomain(JFETTransistorEntity entity);

    JFETTransistorEntity toEntity(JFETTransistor domain);

}
