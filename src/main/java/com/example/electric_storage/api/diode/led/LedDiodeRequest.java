package com.example.electric_storage.api.diode.led;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.diode.led.LedColor;

public record LedDiodeRequest(
    LedColor color,
    double voltage,
    ValueMultiplier voltageMultiplier,
    double luxPower,
    ValueMultiplier powerMultiplier,
    double current,
    ValueMultiplier currentMultiplier) {}
