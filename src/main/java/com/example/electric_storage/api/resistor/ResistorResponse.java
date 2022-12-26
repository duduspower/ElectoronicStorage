package com.example.electric_storage.api.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;

public record ResistorResponse(
    String uniqueId, int resistance, ValueMultiplier multiplier, float tolerance, float power) {}
