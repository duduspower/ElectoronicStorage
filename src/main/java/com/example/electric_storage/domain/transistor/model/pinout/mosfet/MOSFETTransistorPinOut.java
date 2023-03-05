package com.example.electric_storage.domain.transistor.model.pinout.mosfet;

import com.example.electric_storage.infrastructure.transistor.model.MOSFETTransistorEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.FETPinType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class MOSFETTransistorPinOut {
    String uniqueId;

    FETPinType pin1;

    FETPinType pin2;

    FETPinType pin3;

    MOSFETTransistorEntity transistor;
}
