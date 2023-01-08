package com.example.electric_storage.infrastructure.capacitor;

import com.example.electric_storage.domain.capacitor.Capacitor;
import com.example.electric_storage.domain.capacitor.CapacitorMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CapacitorRepositoryImpl implements CapacitorRepository {

  private final CapacitorJpaRepository jpaRepository;
  private final CapacitorMapper mapper;

  @Override
  public List<Capacitor> getCapacitors() {
    return jpaRepository.findAll().stream().map(mapper::toDomain).toList();
  }

  @Override
  public Capacitor getCapacitorByUniqueId(String uniqueId) {
    var capacitor = jpaRepository.findByUniqueId(uniqueId);
    if (capacitor.isPresent()) return mapper.toDomain(capacitor.get());
    throw new EntityNotFoundException("Capacitor for given uniqueId not found");
  }

  @Override
  public void save(Capacitor capacitor) {
    jpaRepository.save(mapper.toEntity(capacitor));
  }
}
