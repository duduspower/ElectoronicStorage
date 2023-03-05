package com.example.electric_storage.domain.transistor.model.pinout.jfet;

import com.example.electric_storage.infrastructure.transistor.model.JFETTransistorEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.FETPinType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class JFETPinOut {
    String uniqueId;

    FETPinType pin1;

    FETPinType pin2;

    FETPinType pin3;

    JFETTransistorEntity transistor;
}
