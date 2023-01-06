package com.example.electric_storage.api.resistor.barcode;

import com.example.electric_storage.domain.resistor.barcode.ResistorBarcode;
import org.mapstruct.Mapper;

@Mapper
public interface ResistorBarcodeApiMapper {

  ResistorBarcodeResponse toResponse(ResistorBarcode domain);

  ResistorBarcode toDomain(ResistorBarcodeRequest request, String uniqueId);
}
