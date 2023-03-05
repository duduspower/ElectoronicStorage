package com.example.electric_storage.infrastructure.transistor.repositories.temperature.bjt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class BJTTransistorTemperatureRepositoryImpl implements BJTTransistorTemperatureRepository {
    private final BJTTransistorTemperatureJpaRepository jpaRepository;
    private final BJTTransistorTemperatureEntityMapper mapper;
}
