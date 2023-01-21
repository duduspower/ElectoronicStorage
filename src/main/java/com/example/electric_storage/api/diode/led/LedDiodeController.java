package com.example.electric_storage.api.diode.led;

import com.example.electric_storage.domain.diode.led.LedDiodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/component/ledDiode")
@RequiredArgsConstructor
public class LedDiodeController {

  private final LedDiodeService service;
  private final LedDiodeApiMapper mapper;

  @GetMapping
  public List<LedDiodeResponse> getLedDiodes() {
    return service.getLedDiodes().stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/{uniqueId}")
  public LedDiodeResponse getLedDiodeByUniqueId(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getLedDiodeByUniqueId(uniqueId));
  }

  @PostMapping
  public void addLedDiode(@RequestBody LedDiodeRequest request) {
    service.addLedDiode(mapper.toDomain(request));
  }
}
