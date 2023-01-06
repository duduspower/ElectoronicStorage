package com.example.electric_storage.api.resistor.barcode;

import com.example.electric_storage.domain.resistor.barcode.ResistorBarcodeService;
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
@RequestMapping("/api/component/resistor/barcode")
public class ResistorBarcodeController {

  private final ResistorBarcodeService service;
  private final ResistorBarcodeApiMapper mapper;

  @GetMapping
  public List<ResistorBarcodeResponse> getResistorBarcodes() {
    var barcodes = service.getResistorBarcodes();
    return barcodes.stream().map(mapper::toResponse).toList();
  }

  @GetMapping("/uniqueId/{uniqueId}")
  public ResistorBarcodeResponse getResistorBarcodeByUniqueId(@PathVariable String uniqueId) {
    return mapper.toResponse(service.getResistorBarcodeByUniqueId(uniqueId));
  }

  @GetMapping("/resistorId/{resistorId}")
  public ResistorBarcodeResponse getResistorBarcodeByResistorId(@PathVariable String resistorId) {
    return mapper.toResponse(service.getResistorBarcodeByResistorId(resistorId));
  }

  @PostMapping
  public void addResistorBarcode(@RequestBody ResistorBarcodeRequest request) {
    service.saveResistorBarcode(mapper.toDomain(request, UUID.randomUUID().toString()));
  }
}
