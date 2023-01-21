package com.example.electric_storage.domain.fuse;

import java.util.Collection;

public interface FuseService {

  Collection<Fuse> getFuses();

  Fuse getFuseByUniqueId(String uniqueId);

  void addFuse(Fuse fuse);
}
