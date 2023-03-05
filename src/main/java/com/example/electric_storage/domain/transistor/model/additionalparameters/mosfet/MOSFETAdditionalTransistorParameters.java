package com.example.electric_storage.domain.transistor.model.additionalparameters.mosfet;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.infrastructure.transistor.model.temperature.MOSFETTransistorTemperatureEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class MOSFETAdditionalTransistorParameters implements AdditionalTransistorParameter {
    String uniqueId;
    double drainSourceVoltage;

    ValueMultiplier drainSourceVoltageMultiplier;

    double gateSourceVoltageContinuous;

    ValueMultiplier gateSourceVoltageContinuousMultiplier;

    double drainContinuousCurrent;

    ValueMultiplier drainContinuousCurrentMultiplier;

    MOSFETTransistorTemperatureEntity temperature;
}
