package com.example.electric_storage.infrastructure.resistor.barcode;

import java.util.Collection;
import java.util.Optional;

public interface ResistorBarcodeRepository {

  Collection<ResistorBarcodeEntity> getResistorBarcodes();

  Optional<ResistorBarcodeEntity> getResistorBarcodeByUniqueId(String uniqueId);

  Optional<ResistorBarcodeEntity> getResistorBarcodeByResistorId(String resistorId);

  void addResistorBarcode(ResistorBarcodeEntity resistorBarcode);
}
