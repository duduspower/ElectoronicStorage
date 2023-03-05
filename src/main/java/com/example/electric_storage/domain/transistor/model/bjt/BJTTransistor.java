package com.example.electric_storage.domain.transistor.model.bjt;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.TransistorPackage;
import com.example.electric_storage.infrastructure.transistor.model.TransistorType;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.BJTAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.BJTTransistorPinOutEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class BJTTransistor {
    String uniqueId;

    TransistorPackage transistorPackage;

    TransistorType transistorType;

    double maxVoltage;

    ValueMultiplier maxVoltageMultiplier;

    double maxCurrent;

    ValueMultiplier maxCurrentMultiplier;

    double maxPower;

    ValueMultiplier maxPowerMultiplier;

    BJTTransistorPinOutEntity pinout;

    BJTAdditionalTransistorParametersEntity additionalParameters;
}
