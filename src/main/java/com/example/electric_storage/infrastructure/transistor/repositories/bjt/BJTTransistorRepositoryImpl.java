package com.example.electric_storage.infrastructure.transistor.repositories.bjt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
class BJTTransistorRepositoryImpl implements BJTTransistorRepository {
    private final BJTTransistorJpaRepository jpaRepository;
}
