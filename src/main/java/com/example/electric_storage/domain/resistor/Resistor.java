package com.example.electric_storage.domain.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Resistor(
    String uniqueId, int resistance, ValueMultiplier multiplier, float tolerance, float power) {}
