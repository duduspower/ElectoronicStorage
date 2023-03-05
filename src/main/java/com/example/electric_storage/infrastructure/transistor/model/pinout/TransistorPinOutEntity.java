package com.example.electric_storage.infrastructure.transistor.model.pinout;

import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.PinType;

public interface TransistorPinOutEntity {
    public PinType getPin1();

    public PinType getPin2();

    public PinType getPin3();
}
