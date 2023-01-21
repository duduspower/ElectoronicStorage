package com.example.electric_storage.infrastructure.diode.led;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface LedDiodeJpaRepository extends JpaRepository<LedDiodeEntity, Long> {
  Optional<LedDiodeEntity> findByUniqueId(String uniqueId);
}
