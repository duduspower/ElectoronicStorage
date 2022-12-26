package com.example.electric_storage.api.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;

public record ResistorRequest(
    int resistance, ValueMultiplier multiplier, float tolerance, float power) {}
