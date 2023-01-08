package com.example.electric_storage.api.inductor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;

public record InductorRequest(
    double inductance,
    ValueMultiplier inductanceMultiplier,
    double tolerance,
    double selfResonantFrequency,
    ValueMultiplier selfResonantFrequencyMultiplier,
    double dcResistance,
    double ratedCurrent,
    boolean withCore) {}
