package com.example.electric_storage.domain.capacitor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CapacitorService {
  List<Capacitor> getCapacitors();

  void save(Capacitor capacitor);
}
