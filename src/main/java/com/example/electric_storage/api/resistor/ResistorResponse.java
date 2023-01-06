package com.example.electric_storage.api.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;

public record ResistorResponse(
    String uniqueId,
    double resistance,
    ValueMultiplier multiplier,
    double tolerance,
    double power) {}
