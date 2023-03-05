package com.example.electric_storage.infrastructure.transistor.repositories.temperature.mosfet;

import com.example.electric_storage.infrastructure.transistor.model.temperature.MOSFETTransistorTemperatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface MOSFETTransistorTemperatureJpaRepository extends JpaRepository<MOSFETTransistorTemperatureEntity, Long> {
}
