package com.example.electric_storage.infrastructure.transistor.model.additionalparameters;

import lombok.Value;

@Value
public class TransistorTemperature {
  double maxOperatingTemperature;
  double storageTemperature;
}
