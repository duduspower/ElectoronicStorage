package com.example.electric_storage.infrastructure.transistor.repositories.mosfet;

import com.example.electric_storage.infrastructure.transistor.model.MOSFETTransistorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface MOSFETTransistorJpaRepository extends JpaRepository<MOSFETTransistorEntity, Long> {
}
