package com.example.electric_storage.infrastructure.transistor.repositories.pinout.bjt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class BJTTransistorPinOutRepositoryImpl implements BJTTransistorPinOutRepository {
    private final BJTTransistorPinOutJpaRepository jpaRepository;
}
