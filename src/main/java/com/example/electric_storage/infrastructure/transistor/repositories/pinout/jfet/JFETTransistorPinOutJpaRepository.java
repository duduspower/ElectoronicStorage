package com.example.electric_storage.infrastructure.transistor.repositories.pinout.jfet;

import com.example.electric_storage.infrastructure.transistor.model.pinout.JFETTransistorPinOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface JFETTransistorPinOutJpaRepository extends JpaRepository<JFETTransistorPinOutEntity, Long> {
}
