package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.jfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class JFETAdditionalTransistorParametersRepositoryImpl implements JFETAdditionalTransistorParametersRepository {
    private final JFETAdditionalTransistorParametersJpaRepository jpaRepository;
    private final JFETAdditionalTransistorParametersEntityMapper mapper;
}
