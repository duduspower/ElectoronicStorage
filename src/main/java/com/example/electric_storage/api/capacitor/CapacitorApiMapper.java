package com.example.electric_storage.api.capacitor;

import com.example.electric_storage.domain.capacitor.Capacitor;
import org.mapstruct.Mapper;

@Mapper
public interface CapacitorApiMapper {
  Capacitor toDomain(CapacitorRequest request);

  CapacitorResponse toResponse(Capacitor capacitor);
}
