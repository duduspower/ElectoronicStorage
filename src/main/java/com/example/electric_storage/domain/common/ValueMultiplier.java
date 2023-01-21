package com.example.electric_storage.domain.common;

import lombok.Getter;

@Getter
public enum ValueMultiplier {
  GIGA(1000000000),
  MEGA(1000000),
  KILO(1000),
  HEKTO(100),
  DEKA(10),
  BASIC(1),
  DECY(0.1),
  CENTY(0.01),
  MILI(0.001),
  MIKRO(0.000001),
  NANO(0.000000001),
  PIKO(0.000000000001);

  private final double value;

  ValueMultiplier(double value) {
    this.value = value;
  }
}
