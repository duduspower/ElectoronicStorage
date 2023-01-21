package com.example.electric_storage.infrastructure.capacitor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface CapacitorJpaRepository extends JpaRepository<CapacitorEntity, Long> {

  Optional<CapacitorEntity> findByUniqueId(String uniqueId);
}
