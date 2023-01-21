package com.example.electric_storage.api.fuse;

import com.example.electric_storage.domain.fuse.FuseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/component/fuse")
@RequiredArgsConstructor
public class FuseController {

  private final FuseService service;
  private final FuseApiMapper mapper;

  @GetMapping
  public List<FuseResponse> getFuses() {
    return service.getFuses().stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/{uniqueId}")
  public FuseResponse getFuse(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getFuseByUniqueId(uniqueId));
  }

  @PostMapping
  public void addFuse(@RequestBody FuseRequest request) {
    service.addFuse(mapper.toDomain(request));
  }
}
