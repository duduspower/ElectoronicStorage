package com.example.electric_storage.domain.capacitor;

import com.example.electric_storage.infrastructure.capacitor.CapacitorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CapacitorMapper {
  CapacitorEntity toEntity(Capacitor capacitor);

  Capacitor toDomain(CapacitorEntity entity);
}
