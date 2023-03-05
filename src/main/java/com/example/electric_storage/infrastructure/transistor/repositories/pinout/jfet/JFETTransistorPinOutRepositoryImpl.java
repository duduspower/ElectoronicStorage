package com.example.electric_storage.infrastructure.transistor.repositories.pinout.jfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class JFETTransistorPinOutRepositoryImpl implements JFETTransistorPinOutRepository {
    private final JFETTransistorPinOutJpaRepository jpaRepository;
    private final JFETTransistorPinOutEntityMapper mapper;
}
