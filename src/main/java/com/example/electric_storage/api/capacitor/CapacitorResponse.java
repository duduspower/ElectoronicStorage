package com.example.electric_storage.api.capacitor;

import com.example.electric_storage.domain.capacitor.CapacitorType;
import com.example.electric_storage.domain.common.ValueMultiplier;

public record CapacitorResponse(
    String uniqueId,
    double capacitance,
    ValueMultiplier multiplier,
    double tolerance,
    double power,
    double impedance,
    CapacitorType capacitorType) {}
