package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.bjt;

import com.example.electric_storage.domain.transistor.model.additionalparameters.bjt.BJTAdditionalTransistorParameters;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.BJTAdditionalTransistorParametersEntity;
import org.mapstruct.Mapper;

@Mapper
interface BJTAdditionalTransistorParametersEntityMapper {

    BJTAdditionalTransistorParameters toDomain(BJTAdditionalTransistorParametersEntity entity);

    BJTAdditionalTransistorParametersEntity toEntity(BJTAdditionalTransistorParameters domain);

}
