package com.example.electric_storage.api.inductor;

import com.example.electric_storage.domain.inductor.Inductor;
import org.mapstruct.Mapper;

@Mapper
public interface InductorApiMapper {

  InductorResponse toResponse(Inductor domain);

  Inductor toDomain(InductorRequest request, String uniqueId);
}
