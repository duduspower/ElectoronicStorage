package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.mosfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class MOSFETAdditionalTransistorParametersRepositoryImpl implements MOSFETAdditionalTransistorParametersRepository {
    private final MOSFETAdditionalTransistorParametersJpaRepository jpaRepository;
    private final MOSFETAdditionalTransistorParametersEntityMapper mapper;
}
