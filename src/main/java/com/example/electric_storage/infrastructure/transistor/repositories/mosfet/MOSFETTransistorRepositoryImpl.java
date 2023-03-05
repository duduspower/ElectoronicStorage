package com.example.electric_storage.infrastructure.transistor.repositories.mosfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class MOSFETTransistorRepositoryImpl implements MOSFETTransistorRepository {
    private final MOSFETTransistorJpaRepository jpaRepository;
}
