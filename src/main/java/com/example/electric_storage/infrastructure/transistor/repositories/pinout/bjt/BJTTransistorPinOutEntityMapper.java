package com.example.electric_storage.infrastructure.transistor.repositories.pinout.bjt;

import com.example.electric_storage.domain.transistor.model.pinout.bjt.BJTTransistorPinOut;
import com.example.electric_storage.infrastructure.transistor.model.pinout.BJTTransistorPinOutEntity;
import org.mapstruct.Mapper;

@Mapper
interface BJTTransistorPinOutEntityMapper {

    BJTTransistorPinOut toDomain(BJTTransistorPinOutEntity entity);

    BJTTransistorPinOutEntity toEntity(BJTTransistorPinOut domain);

}
