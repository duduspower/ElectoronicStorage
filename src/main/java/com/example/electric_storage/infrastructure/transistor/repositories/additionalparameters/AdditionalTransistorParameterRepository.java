package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters;

import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;

import java.util.Collection;

public interface AdditionalTransistorParameterRepository {

    AdditionalTransistorParameter getAdditionalParameter(String uniqueId);

    Collection<AdditionalTransistorParameter> getAdditionalParameters();

    AdditionalTransistorParameter addAdditionalParameter(AdditionalTransistorParameter parameter);

    void deleteAdditionalParameter(String uniqueId);
}
