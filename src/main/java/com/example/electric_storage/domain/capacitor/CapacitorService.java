package com.example.electric_storage.domain.capacitor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CapacitorService {
  List<Capacitor> getCapacitors();

  Capacitor getCapacitorByUniqueId(String uniqueId);

  void save(Capacitor capacitor);
}
