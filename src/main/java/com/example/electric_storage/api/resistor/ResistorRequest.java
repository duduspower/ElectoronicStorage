package com.example.electric_storage.api.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record ResistorRequest(
    String barcodeId,
    double resistance,
    ValueMultiplier multiplier,
    double tolerance,
    double power) {}
