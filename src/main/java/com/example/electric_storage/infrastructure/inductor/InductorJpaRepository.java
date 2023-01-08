package com.example.electric_storage.infrastructure.inductor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InductorJpaRepository extends JpaRepository<InductorEntity, Long> {

  Optional<InductorEntity> findByUniqueId(String uniqueId);
}
