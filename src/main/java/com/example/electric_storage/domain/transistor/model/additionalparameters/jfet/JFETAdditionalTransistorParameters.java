package com.example.electric_storage.domain.transistor.model.additionalparameters.jfet;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.infrastructure.transistor.model.temperature.JFETTransistorTemperatureEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class JFETAdditionalTransistorParameters implements AdditionalTransistorParameter {
    String uniqueId;
    double drainSourceVoltage;

    ValueMultiplier drainSourceVoltageMultiplier;

    double gateSourceVoltage;

    ValueMultiplier gateSourceVoltageMultiplier;

    double gateCurrent;

    ValueMultiplier gateCurrentMultiplier;

    JFETTransistorTemperatureEntity temperature;
}
