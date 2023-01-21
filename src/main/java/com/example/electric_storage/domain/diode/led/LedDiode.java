package com.example.electric_storage.domain.diode.led;

import com.example.electric_storage.domain.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record LedDiode(
    String uniqueId,
    LedColor color,
    double voltage,
    ValueMultiplier voltageMultiplier,
    double luxPower,
    ValueMultiplier powerMultiplier,
    double current,
    ValueMultiplier currentMultiplier) {}
