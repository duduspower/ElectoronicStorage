package com.example.electric_storage.infrastructure.resistor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface ResistorJpaRepository extends JpaRepository<ResistorEntity, Long> {

  Optional<ResistorEntity> findByUniqueId(String uniqueId);
}
