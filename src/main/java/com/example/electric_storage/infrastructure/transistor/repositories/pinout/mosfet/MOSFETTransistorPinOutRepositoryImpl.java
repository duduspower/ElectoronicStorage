package com.example.electric_storage.infrastructure.transistor.repositories.pinout.mosfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class MOSFETTransistorPinOutRepositoryImpl implements MOSFETTransistorPinOutRepository {
    private final MOSFETTransistorPinOutJpaRepository jpaRepository;
}
