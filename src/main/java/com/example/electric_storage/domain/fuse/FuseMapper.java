package com.example.electric_storage.domain.fuse;

import com.example.electric_storage.infrastructure.fuse.FuseEntity;
import org.mapstruct.Mapper;

@Mapper
public interface FuseMapper {
  Fuse toDomain(FuseEntity entity);

  FuseEntity toEntity(Fuse fuse);
}
