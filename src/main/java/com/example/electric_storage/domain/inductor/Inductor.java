package com.example.electric_storage.domain.inductor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Inductor(
    String uniqueId,
    double inductance,
    ValueMultiplier inductanceMultiplier,
    double tolerance,
    double selfResonantFrequency,
    ValueMultiplier selfResonantFrequencyMultiplier,
    double dcResistance,
    double ratedCurrent,
    boolean withCore) {}
