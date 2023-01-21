package com.example.electric_storage.infrastructure.diode.normal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiodeJpaRepository extends JpaRepository<DiodeEntity, Long> {

  Optional<DiodeEntity> findByUniqueId(String uniqueId);
}
