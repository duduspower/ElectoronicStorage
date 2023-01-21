package com.example.electric_storage.infrastructure.fuse;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuseJpaRepository extends JpaRepository<FuseEntity, Long> {

  Optional<FuseEntity> findByUniqueId(String uniqueId);
}
