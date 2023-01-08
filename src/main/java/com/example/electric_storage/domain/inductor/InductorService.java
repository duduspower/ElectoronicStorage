package com.example.electric_storage.domain.inductor;

import java.util.Collection;

public interface InductorService {

  Collection<Inductor> getInductors();

  Inductor getInductorByUniqueId(String uniqueId);

  void addInductor(Inductor inductor);
}
