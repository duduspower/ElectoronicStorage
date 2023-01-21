package com.example.electric_storage.domain.resistor;

import com.example.electric_storage.domain.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Resistor(
    String uniqueId,
    String barcodeId,
    double resistance,
    ValueMultiplier multiplier,
    double tolerance,
    double power) {}
