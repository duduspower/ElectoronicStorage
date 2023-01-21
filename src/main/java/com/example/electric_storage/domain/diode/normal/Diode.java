package com.example.electric_storage.domain.diode.normal;

import com.example.electric_storage.domain.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Diode(
    String uniqueId,
    DiodeType type,
    double resistance,
    ValueMultiplier resistanceMultiplier,
    double capacitance,
    ValueMultiplier capacitanceMultiplier,
    double saturationCurrent,
    ValueMultiplier saturationCurrentMultiplier,
    double forwardVoltage,
    ValueMultiplier forwardVoltageMultiplier,
    double backwardVoltage,
    ValueMultiplier backwardVoltageMultiplier) {}
