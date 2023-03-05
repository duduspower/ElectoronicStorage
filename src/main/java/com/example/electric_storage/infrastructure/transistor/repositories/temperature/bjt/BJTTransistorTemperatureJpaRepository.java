package com.example.electric_storage.infrastructure.transistor.repositories.temperature.bjt;

import com.example.electric_storage.infrastructure.transistor.model.temperature.BJTTransistorTemperatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BJTTransistorTemperatureJpaRepository extends JpaRepository<BJTTransistorTemperatureEntity, Long> {
}
