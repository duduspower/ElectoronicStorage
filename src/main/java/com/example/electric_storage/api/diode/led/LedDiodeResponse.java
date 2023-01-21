package com.example.electric_storage.api.diode.led;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.diode.led.LedColor;

public record LedDiodeResponse(
    String uniqueId,
    LedColor color,
    double voltage,
    ValueMultiplier voltageMultiplier,
    double luxPower,
    ValueMultiplier powerMultiplier,
    double current,
    ValueMultiplier currentMultiplier) {}
