package com.example.electric_storage.domain.transistor.model.additionalparameters.bjt;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.infrastructure.transistor.model.temperature.BJTTransistorTemperatureEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class BJTAdditionalTransistorParameters implements AdditionalTransistorParameter {
    String uniqueId;
    double collectorEmiterVoltageWithEmiterVoltageEqualsZero;

    ValueMultiplier collectorEmiterVoltageWithEmiterVoltageEqualsZeroMultiplier;

    double collectorEmiterVoltageWithBaseVoltageEqualsZero;

    ValueMultiplier collectorEmiterVoltageWithBaseVoltageEqualsZeroMultiplier;

    double emiterBaseVoltage;

    ValueMultiplier emiterBaseVoltageMultiplier;

    double collectorCurrent;

    ValueMultiplier collectorCurrentMultiplier;

    double collectorPeakCurrent;

    ValueMultiplier collectorPeakCurrentMultiplier;

    BJTTransistorTemperatureEntity temperature;
}
