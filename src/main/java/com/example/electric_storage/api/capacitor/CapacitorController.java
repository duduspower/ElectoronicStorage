package com.example.electric_storage.api.capacitor;

import com.example.electric_storage.domain.capacitor.CapacitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/component/capacitor")
public class CapacitorController {

  private final CapacitorService service;
  private final CapacitorApiMapper mapper;

  @GetMapping
  public List<CapacitorResponse> getCapacitors() {
    return service.getCapacitors().stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/{uniqueId}")
  public CapacitorResponse getCapacitorByUniqueId(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getCapacitorByUniqueId(uniqueId));
  }

  @PostMapping
  public ResponseEntity<?> saveCapacitor(@RequestBody CapacitorRequest capacitorRequest) {
    var capacitor = mapper.toDomain(capacitorRequest);
    capacitor = capacitor.toBuilder().uniqueId(UUID.randomUUID().toString()).build();
    service.save(capacitor);
    return ResponseEntity.ok().build();
  }
}
