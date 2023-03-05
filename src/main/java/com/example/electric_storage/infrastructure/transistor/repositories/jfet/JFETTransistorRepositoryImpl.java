package com.example.electric_storage.infrastructure.transistor.repositories.jfet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class JFETTransistorRepositoryImpl implements JFETTransistorRepository {
    private final JFETTransistorJpaRepository jpaRepository;
    private final JFETTransistorEntityMapper mapper;
}
