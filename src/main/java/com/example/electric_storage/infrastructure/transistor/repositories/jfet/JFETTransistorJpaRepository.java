package com.example.electric_storage.infrastructure.transistor.repositories.jfet;

import com.example.electric_storage.infrastructure.transistor.model.JFETTransistorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface JFETTransistorJpaRepository extends JpaRepository<JFETTransistorEntity, Long> {
}
