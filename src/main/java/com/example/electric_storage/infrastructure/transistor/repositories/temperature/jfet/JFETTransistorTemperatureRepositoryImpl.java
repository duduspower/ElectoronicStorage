package com.example.electric_storage.infrastructure.transistor.repositories.temperature.jfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class JFETTransistorTemperatureRepositoryImpl implements JFETTransistorTemperatureRepository {
    private final JFETTransistorTemperatureJpaRepository jpaRepository;
    private final JFETTransistorTemperatureEntityMapper mapper;
}
