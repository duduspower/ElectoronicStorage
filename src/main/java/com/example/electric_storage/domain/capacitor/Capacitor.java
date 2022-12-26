package com.example.electric_storage.domain.capacitor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Capacitor(
    Long id,
    String uniqueId,
    int capacitance,
    ValueMultiplier multiplier,
    float tolerance,
    float power,
    int impedance,
    CapacitorType capacitorType) {}
