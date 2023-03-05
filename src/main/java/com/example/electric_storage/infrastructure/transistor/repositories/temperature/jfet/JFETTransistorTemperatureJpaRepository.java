package com.example.electric_storage.infrastructure.transistor.repositories.temperature.jfet;

import com.example.electric_storage.infrastructure.transistor.model.temperature.JFETTransistorTemperatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface JFETTransistorTemperatureJpaRepository extends JpaRepository<JFETTransistorTemperatureEntity, Long> {
}
