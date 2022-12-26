package com.example.electric_storage.domain.capacitor;

import com.example.electric_storage.infrastructure.capacitor.CapacitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CapacitorServiceImpl implements CapacitorService {

  private final CapacitorRepository repository;

  @Override
  public List<Capacitor> getCapacitors() {
    return repository.getCapacitors();
  }

  @Override
  public void save(Capacitor capacitor) {
    repository.save(capacitor);
  }
}
