package com.example.electric_storage.infrastructure.transistor.pins.pinout;

import com.example.electric_storage.infrastructure.transistor.pins.TransistorPinType;
import com.example.electric_storage.infrastructure.transistor.pins.pintype.BJTPinType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BJTTransistorPinOut implements TransistorPinType, TransistorPinOut {
  private BJTPinType pin1;
  private BJTPinType pin2;
  private BJTPinType pin3;
}
