package com.example.electric_storage.domain.transistor.model.temperature.bjt;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.BJTAdditionalTransistorParametersEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class BJTTransistorTemperature {

    String uniqueId;
    double maxOperatingTemperature;
    double storageTemperature;

    BJTAdditionalTransistorParametersEntity parameters;
}
