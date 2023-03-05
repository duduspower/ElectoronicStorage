package com.example.electric_storage.domain.transistor.model.jfet;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.TransistorPackage;
import com.example.electric_storage.infrastructure.transistor.model.TransistorType;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.JFETAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.JFETTransistorPinOutEntity;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class JFETTransistor {
 String uniqueId;

 TransistorPackage transistorPackage;
 TransistorType transistorType;
 double maxVoltage;

 ValueMultiplier maxVoltageMultiplier;

 double maxCurrent;

 ValueMultiplier maxCurrentMultiplier;

 double maxPower;

 ValueMultiplier maxPowerMultiplier;

 JFETTransistorPinOutEntity pinout;

 JFETAdditionalTransistorParametersEntity additionalParameters;

}
