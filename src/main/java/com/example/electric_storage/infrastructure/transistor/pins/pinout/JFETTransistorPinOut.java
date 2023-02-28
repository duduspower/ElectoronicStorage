package com.example.electric_storage.infrastructure.transistor.pins.pinout;

import com.example.electric_storage.infrastructure.transistor.pins.TransistorPinType;
import com.example.electric_storage.infrastructure.transistor.pins.pintype.FETPinType;
import lombok.Getter;

@Getter
public class JFETTransistorPinOut implements TransistorPinType, TransistorPinOut {
  private FETPinType pin1;
  private FETPinType pin2;
  private FETPinType pin3;
}
