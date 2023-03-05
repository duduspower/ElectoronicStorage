package com.example.electric_storage.domain.transistor.model.mosfet;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.TransistorPackage;
import com.example.electric_storage.infrastructure.transistor.model.TransistorType;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.MOSFETAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.MOSFETTransistorPinOutEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class MOSFETTransistor {
 String uniqueId;
 TransistorPackage transistorPackage;
 TransistorType transistorType;

 double maxVoltage;

 ValueMultiplier maxVoltageMultiplier;

 double maxCurrent;

 ValueMultiplier maxCurrentMultiplier;

 double maxPower;

 ValueMultiplier maxPowerMultiplier;

 MOSFETTransistorPinOutEntity pinout;

 MOSFETAdditionalTransistorParametersEntity additionalParameters;
}
