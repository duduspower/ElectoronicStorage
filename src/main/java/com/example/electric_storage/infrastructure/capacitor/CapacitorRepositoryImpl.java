package com.example.electric_storage.infrastructure.capacitor;

import com.example.electric_storage.domain.capacitor.Capacitor;
import com.example.electric_storage.domain.capacitor.CapacitorMapper;
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
  public void save(Capacitor capacitor) {
    jpaRepository.save(mapper.toEntity(capacitor));
  }
}
