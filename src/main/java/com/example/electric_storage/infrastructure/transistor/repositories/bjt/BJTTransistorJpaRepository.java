package com.example.electric_storage.infrastructure.transistor.repositories.bjt;

import com.example.electric_storage.infrastructure.transistor.model.BJTTransistorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface BJTTransistorJpaRepository extends JpaRepository<BJTTransistorEntity, Long> {
}
