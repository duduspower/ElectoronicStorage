package com.example.electric_storage.api.diode.normal;

import com.example.electric_storage.domain.diode.normal.DiodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/component/diode")
@RequiredArgsConstructor
public class DiodeController {

  private final DiodeService service;
  private final DiodeApiMapper mapper;

  @GetMapping
  public List<DiodeResponse> getDiodes() {
    return service.getDiodes().stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/{uniqueId}")
  public DiodeResponse getDiodeByUniqueId(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getDiodeByUniqueId(uniqueId));
  }

  @PostMapping
  public void addDiode(@RequestBody DiodeRequest request) {
    service.addDiode(mapper.toDomain(request));
  }
}
