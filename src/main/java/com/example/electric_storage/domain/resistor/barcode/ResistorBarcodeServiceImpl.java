package com.example.electric_storage.domain.resistor.barcode;

import com.example.electric_storage.infrastructure.common.BarcodeColor;
import com.example.electric_storage.infrastructure.resistor.barcode.ResistorBarcodeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResistorBarcodeServiceImpl implements ResistorBarcodeService {

  private final ResistorBarcodeRepository repository;
  private final ResistorBarcodeMapper mapper;

  @Override
  public ResistorBarcode calculateBarcode(List<BarcodeColor> colors) {
    return null;
  }

  @Override
  public Collection<ResistorBarcode> getResistorBarcodes() {
    var barcodes = repository.getResistorBarcodes();
    return barcodes.stream().map(mapper::toDomain).toList();
  }

  @Override
  public ResistorBarcode getResistorBarcodeByResistorId(String resistorId) {
    var barcode = repository.getResistorBarcodeByResistorId(resistorId);
    if (barcode.isPresent()) {
      return mapper.toDomain(barcode.get());
    }
    throw new EntityNotFoundException("Resistor Barcode for given resistorId not found");
  }

  @Override
  public ResistorBarcode getResistorBarcodeByUniqueId(String uniqueId) {
    var barcode = repository.getResistorBarcodeByUniqueId(uniqueId);
    if (barcode.isPresent()) {
      return mapper.toDomain(barcode.get());
    }
    throw new EntityNotFoundException("Resistor Barcode for given uniqueId not found");
  }

  @Override
  public void saveResistorBarcode(ResistorBarcode barcode) {
    repository.addResistorBarcode(mapper.toEntity(barcode));
  }
}
