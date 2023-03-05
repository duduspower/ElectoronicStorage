package com.example.electric_storage.infrastructure.transistor.repositories.pinout.bjt;

import com.example.electric_storage.infrastructure.transistor.model.pinout.BJTTransistorPinOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface BJTTransistorPinOutJpaRepository extends JpaRepository<BJTTransistorPinOutEntity, Long> {
}
