package com.example.electric_storage.domain.fuse;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.fuse.FuseType;
import lombok.Builder;

@Builder(toBuilder = true)
public record Fuse(String uniqueId, FuseType type, double value, ValueMultiplier multiplier) {}
