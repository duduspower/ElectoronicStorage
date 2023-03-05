package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.mosfet;

import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.AdditionalTransistorParameterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@RequiredArgsConstructor
class MOSFETAdditionalTransistorParametersRepositoryImpl implements MOSFETAdditionalTransistorParametersRepository, AdditionalTransistorParameterRepository {
    private final MOSFETAdditionalTransistorParametersJpaRepository jpaRepository;
    private final MOSFETAdditionalTransistorParametersEntityMapper mapper;

    @Override
    public AdditionalTransistorParameter getAdditionalParameter(String uniqueId) {
        return null;
    }

    @Override
    public Collection<AdditionalTransistorParameter> getAdditionalParameters() {
        return null;
    }

    @Override
    public AdditionalTransistorParameter addAdditionalParameter(AdditionalTransistorParameter parameter) {
        return null;
    }

    @Override
    public void deleteAdditionalParameter(String uniqueId) {

    }
}
