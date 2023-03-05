package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters;

import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;

import java.util.Optional;

public interface AdditionalTransistorParametersJpaRepository {

    Optional<AdditionalTransistorParameter> findByUniqueId(String uniqueId);

    void deleteByUniqueId(String uniqueId);
}
