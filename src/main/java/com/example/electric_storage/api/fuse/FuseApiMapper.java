package com.example.electric_storage.api.fuse;

import com.example.electric_storage.domain.fuse.Fuse;
import org.mapstruct.Mapper;

@Mapper
public interface FuseApiMapper {
  FuseResponse toResponse(Fuse fuse);

  Fuse toDomain(FuseRequest request);
}
