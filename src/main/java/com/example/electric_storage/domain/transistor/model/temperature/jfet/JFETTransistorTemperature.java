package com.example.electric_storage.domain.transistor.model.temperature.jfet;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.JFETAdditionalTransistorParametersEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class JFETTransistorTemperature {

    String uniqueId;
    double maxOperatingTemperature;
    double storageTemperature;
    JFETAdditionalTransistorParametersEntity parameters;
}
