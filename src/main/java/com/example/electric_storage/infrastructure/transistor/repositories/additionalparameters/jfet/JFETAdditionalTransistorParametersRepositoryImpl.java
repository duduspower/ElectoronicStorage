package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.jfet;

import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.AdditionalTransistorParameterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@RequiredArgsConstructor
class JFETAdditionalTransistorParametersRepositoryImpl implements JFETAdditionalTransistorParametersRepository, AdditionalTransistorParameterRepository {
    private final JFETAdditionalTransistorParametersJpaRepository jpaRepository;
    private final JFETAdditionalTransistorParametersEntityMapper mapper;

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
