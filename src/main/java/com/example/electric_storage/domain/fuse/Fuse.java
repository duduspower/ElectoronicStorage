package com.example.electric_storage.domain.fuse;

import com.example.electric_storage.domain.common.ValueMultiplier;
import lombok.Builder;

@Builder(toBuilder = true)
public record Fuse(String uniqueId, FuseType type, double value, ValueMultiplier multiplier) {}
