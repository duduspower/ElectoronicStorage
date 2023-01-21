package com.example.electric_storage.infrastructure.resistor.barcode;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface ResistorBarcodeJpaRepository extends JpaRepository<ResistorBarcodeEntity, Long> {
  Optional<ResistorBarcodeEntity> findByResistorId(String resistorId);

  Optional<ResistorBarcodeEntity> findByUniqueId(String uniqueId);
}
