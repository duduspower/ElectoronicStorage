package com.example.electric_storage.infrastructure.transistor.repositories.bjt;

import com.example.electric_storage.domain.transistor.model.bjt.BJTTransistor;
import com.example.electric_storage.infrastructure.transistor.model.BJTTransistorEntity;
import org.mapstruct.Mapper;

@Mapper
interface BJTTransistorEntityMapper {

    BJTTransistor toDomain(BJTTransistorEntity entity);

    BJTTransistorEntity toEntity(BJTTransistor domain);

}
