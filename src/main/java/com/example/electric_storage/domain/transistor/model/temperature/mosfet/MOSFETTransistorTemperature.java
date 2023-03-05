package com.example.electric_storage.domain.transistor.model.temperature.mosfet;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.MOSFETAdditionalTransistorParametersEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class MOSFETTransistorTemperature {
     String uniqueId;
     double maxOperatingTemperature;
     double storageTemperature;
     MOSFETAdditionalTransistorParametersEntity parameters;
}
