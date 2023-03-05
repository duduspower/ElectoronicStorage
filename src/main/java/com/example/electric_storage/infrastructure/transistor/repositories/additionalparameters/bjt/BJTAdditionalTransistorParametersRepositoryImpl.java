package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.bjt;

import com.example.electric_storage.domain.transistor.model.additionalparameters.AdditionalTransistorParameter;
import com.example.electric_storage.domain.transistor.model.additionalparameters.bjt.BJTAdditionalTransistorParameters;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.BJTAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.AdditionalTransistorParameterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
class BJTAdditionalTransistorParametersRepositoryImpl implements BJTAdditionalTransistorParametersRepository, AdditionalTransistorParameterRepository {

    private final BJTAdditionalTransistorParametersJpaRepository jpaRepository;
    private final BJTAdditionalTransistorParametersEntityMapper mapper;

    @Override
    public AdditionalTransistorParameter getAdditionalParameter(String uniqueId) {
        var additionalParameter = jpaRepository.findByUniqueId(uniqueId);
        if (additionalParameter.isEmpty())
            throw new EntityNotFoundException(String.format("Additional Parameter for given uniqueId was not found : %s", uniqueId));
        return mapper.toDomain((BJTAdditionalTransistorParametersEntity) additionalParameter.get());
    }

    @Override
    public Collection<AdditionalTransistorParameter> getAdditionalParameters() {
        var additionalParameters = jpaRepository.findAll();
        return additionalParameters.stream().map(mapper::toDomain).collect(Collectors.toList());
    }


    @Override
    public AdditionalTransistorParameter addAdditionalParameter(AdditionalTransistorParameter parameter) {
        return (AdditionalTransistorParameter) jpaRepository.save(mapper.toEntity((BJTAdditionalTransistorParameters) parameter));
    }

    @Override
    public void deleteAdditionalParameter(String uniqueId) {
        jpaRepository.deleteByUniqueId(uniqueId);
    }
}
