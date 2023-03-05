package com.example.electric_storage.infrastructure.transistor.repositories.pinout.mosfet;

import com.example.electric_storage.infrastructure.transistor.model.pinout.MOSFETTransistorPinOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface MOSFETTransistorPinOutJpaRepository extends JpaRepository<MOSFETTransistorPinOutEntity, Long> {
}
