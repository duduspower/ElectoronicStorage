package com.example.electric_storage.infrastructure.transistor.model.pins.pinout;

import com.example.electric_storage.infrastructure.transistor.model.pins.pintype.PinType;

public interface TransistorPinOut {
  public PinType getPin1();

  public PinType getPin2();

  public PinType getPin3();
}
