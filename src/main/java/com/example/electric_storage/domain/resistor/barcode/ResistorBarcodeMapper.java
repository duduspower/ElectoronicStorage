package com.example.electric_storage.domain.resistor.barcode;

import com.example.electric_storage.infrastructure.resistor.barcode.ResistorBarcodeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ResistorBarcodeMapper {
  ResistorBarcodeEntity toEntity(ResistorBarcode domain);

  ResistorBarcode toDomain(ResistorBarcodeEntity entity);
}
