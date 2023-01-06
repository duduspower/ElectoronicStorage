package com.example.electric_storage.domain.resistor.barcode;

import com.example.electric_storage.infrastructure.common.BarcodeColor;

import java.util.Collection;
import java.util.List;

public interface ResistorBarcodeService {
  ResistorBarcode calculateBarcode(List<BarcodeColor> colors);

  Collection<ResistorBarcode> getResistorBarcodes();

  ResistorBarcode getResistorBarcodeByResistorId(String resistorId);

  ResistorBarcode getResistorBarcodeByUniqueId(String uniqueId);

  void saveResistorBarcode(ResistorBarcode barcode);
}
