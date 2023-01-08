package com.example.electric_storage.api.inductor;

import com.example.electric_storage.domain.inductor.InductorService;
import lombok.RequiredArgsConstructor;
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
@RequestMapping("/api/component/inductor")
public class InductorController {

  private final InductorService service;
  private final InductorApiMapper mapper;

  @GetMapping
  public List<InductorResponse> getInductors() {
    var inductors = service.getInductors();
    return inductors.stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/{uniqueId}")
  public InductorResponse getInductorByUniqueId(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getInductorByUniqueId(uniqueId));
  }

  @PostMapping
  public void addInductor(@RequestBody InductorRequest request) {
    service.addInductor(mapper.toDomain(request, UUID.randomUUID().toString()));
  }
}
