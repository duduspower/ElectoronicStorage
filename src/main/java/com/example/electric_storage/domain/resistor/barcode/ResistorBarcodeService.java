package com.example.electric_storage.domain.resistor.barcode;

import java.util.Collection;

public interface ResistorBarcodeService {
  Collection<ResistorBarcode> getResistorBarcodes();

  ResistorBarcode getResistorBarcodeByResistorId(String resistorId);

  ResistorBarcode getResistorBarcodeByUniqueId(String uniqueId);

  void saveResistorBarcode(ResistorBarcode barcode);
}
