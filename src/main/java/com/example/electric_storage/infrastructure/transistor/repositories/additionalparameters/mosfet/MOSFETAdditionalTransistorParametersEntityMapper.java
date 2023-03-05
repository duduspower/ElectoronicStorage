package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.mosfet;

import com.example.electric_storage.domain.transistor.model.additionalparameters.mosfet.MOSFETAdditionalTransistorParameters;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.MOSFETAdditionalTransistorParametersEntity;
import org.mapstruct.Mapper;

@Mapper
interface MOSFETAdditionalTransistorParametersEntityMapper {

    MOSFETAdditionalTransistorParametersEntity toDomain(MOSFETAdditionalTransistorParameters domain);

    MOSFETAdditionalTransistorParameters toEntity(MOSFETAdditionalTransistorParametersEntity entity);

}
