package com.example.electric_storage.api.capacitor;

import com.example.electric_storage.domain.capacitor.CapacitorType;
import com.example.electric_storage.infrastructure.common.ValueMultiplier;

public record CapacitorRequest(
    int capacitance,
    ValueMultiplier multiplier,
    float tolerance,
    float power,
    int impedance,
    CapacitorType capacitorType) {}
