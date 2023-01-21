package com.example.electric_storage.api.inductor;

import com.example.electric_storage.domain.common.ValueMultiplier;

public record InductorResponse(
    String uniqueId,
    double inductance,
    ValueMultiplier inductanceMultiplier,
    double tolerance,
    double selfResonantFrequency,
    ValueMultiplier selfResonantFrequencyMultiplier,
    double dcResistance,
    double ratedCurrent,
    boolean withCore) {}
