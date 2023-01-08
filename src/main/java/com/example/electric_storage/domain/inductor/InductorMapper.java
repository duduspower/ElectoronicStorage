package com.example.electric_storage.domain.inductor;

import com.example.electric_storage.infrastructure.inductor.InductorEntity;
import org.mapstruct.Mapper;

@Mapper
public interface InductorMapper {

  InductorEntity toEntity(Inductor domain);

  Inductor toDomain(InductorEntity entity);
}
