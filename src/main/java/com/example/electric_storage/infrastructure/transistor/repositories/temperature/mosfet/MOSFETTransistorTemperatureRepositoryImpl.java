package com.example.electric_storage.infrastructure.transistor.repositories.temperature.mosfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class MOSFETTransistorTemperatureRepositoryImpl implements MOSFETTransistorTemperatureRepository {
    private final MOSFETTransistorTemperatureJpaRepository jpaRepository;
}
