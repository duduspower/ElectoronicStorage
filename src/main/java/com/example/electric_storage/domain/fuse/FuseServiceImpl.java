package com.example.electric_storage.domain.fuse;

import com.example.electric_storage.infrastructure.fuse.FuseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FuseServiceImpl implements FuseService {

  private final FuseRepository repository;
  private final FuseMapper mapper;

  @Override
  public Collection<Fuse> getFuses() {
    var fuses = repository.getFuses();
    return fuses.stream().map(mapper::toDomain).toList();
  }

  @Override
  public Fuse getFuseByUniqueId(String uniqueId) {
    var fuse = repository.getFuseByUniqueId(uniqueId);
    if (fuse.isPresent()) return mapper.toDomain(fuse.get());
    throw new EntityNotFoundException("Fuse for given unique id not found");
  }

  @Override
  public void addFuse(Fuse fuse) {
    repository.addFuse(
        mapper.toEntity(fuse.toBuilder().uniqueId(UUID.randomUUID().toString()).build()));
  }
}
