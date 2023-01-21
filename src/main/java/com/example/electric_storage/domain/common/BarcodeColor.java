package com.example.electric_storage.domain.common;

public enum BarcodeColor {
  BLACK((byte) 0),
  BROWN((byte) 1),
  RED((byte) 2),
  ORANGE((byte) 3),
  YELLOW((byte) 4),
  GREEN((byte) 5),
  BLUE((byte) 6),
  VIOLET((byte) 7),
  GREY((byte) 8),
  WHITE((byte) 9);

  final byte multiplier;

  BarcodeColor(byte multiplier) {
    this.multiplier = multiplier;
  }
}
