package com.example.electric_storage.api.resistor;

import com.example.electric_storage.domain.resistor.ResistorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/component/resistor")
public class ResistorController {

  private final ResistorService service;
  private final ResistorApiMapper mapper;

  @GetMapping
  public List<ResistorResponse> getResistors() {
    var resistors = service.getResistors();
    return resistors.stream().map(mapper::toResponse).toList();
  }

  @PostMapping
  public ResponseEntity<?> addResistor(@RequestBody ResistorRequest request) {
    var resistor = mapper.toDomain(request);
    resistor = resistor.toBuilder().uniqueId(UUID.randomUUID().toString()).build();
    service.addResistor(resistor);
    return ResponseEntity.ok().build();
  }
}
