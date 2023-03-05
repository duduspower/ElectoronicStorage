package com.example.electric_storage.infrastructure.transistor.repositories.additionalparameters.bjt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class BJTAdditionalTransistorParametersRepositoryImpl implements BJTAdditionalTransistorParametersRepository {

    private final BJTAdditionalTransistorParametersJpaRepository jpaRepository;

}
