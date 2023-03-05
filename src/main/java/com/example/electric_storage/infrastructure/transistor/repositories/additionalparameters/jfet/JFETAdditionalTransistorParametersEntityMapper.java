package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.jfet;

import com.example.electric_storage.domain.transistor.model.additionalparameters.jfet.JFETAdditionalTransistorParameters;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.JFETAdditionalTransistorParametersEntity;
import org.mapstruct.Mapper;

@Mapper
interface JFETAdditionalTransistorParametersEntityMapper {

    JFETAdditionalTransistorParametersEntity toDomain(JFETAdditionalTransistorParameters domain);

    JFETAdditionalTransistorParameters toEntity(JFETAdditionalTransistorParametersEntity entity);
}
