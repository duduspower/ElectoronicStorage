package com.example.electric_storage.domain.capacitor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Capacitor(
    String uniqueId,
    double capacitance,
    ValueMultiplier multiplier,
    double tolerance,
    double power,
    double impedance,
    CapacitorType capacitorType) {}
