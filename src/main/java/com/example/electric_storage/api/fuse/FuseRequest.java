package com.example.electric_storage.api.fuse;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.fuse.FuseType;

public record FuseRequest(FuseType type, double value, ValueMultiplier multiplier) {}
