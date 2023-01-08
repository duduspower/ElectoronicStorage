package com.example.electric_storage.infrastructure.capacitor;

import com.example.electric_storage.domain.capacitor.Capacitor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapacitorRepository {
  List<Capacitor> getCapacitors();

  Capacitor getCapacitorByUniqueId(String uniqueId);

  void save(Capacitor capacitor);
}
