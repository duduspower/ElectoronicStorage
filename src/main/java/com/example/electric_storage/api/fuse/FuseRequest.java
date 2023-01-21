package com.example.electric_storage.api.fuse;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.fuse.FuseType;

public record FuseRequest(FuseType type, double value, ValueMultiplier multiplier) {}
