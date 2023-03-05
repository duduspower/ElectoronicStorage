package com.example.electric_storage.infrastructure.transistor.model;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.AdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.TransistorPinOutEntity;

interface TransistorEntity {
    Long getId();

    String getUniqueId();

    TransistorPackage getTransistorPackage();

    TransistorType getTransistorType();

    double getMaxVoltage();

    ValueMultiplier getMaxVoltageMultiplier();

    double getMaxCurrent();

    ValueMultiplier getMaxCurrentMultiplier();

    double getMaxPower();

    ValueMultiplier getMaxPowerMultiplier();

    TransistorPinOutEntity getPinout();

    AdditionalTransistorParametersEntity getAdditionalParameters();
}
