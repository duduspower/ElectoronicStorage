package com.example.electric_storage.infrastructure.transistor.repository;

import com.example.electric_storage.infrastructure.transistor.model.JFETTransistorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface TransistorJpaRepository extends JpaRepository<JFETTransistorEntity, Long> {
}
