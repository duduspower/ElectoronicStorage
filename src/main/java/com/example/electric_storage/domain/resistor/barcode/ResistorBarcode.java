package com.example.electric_storage.domain.resistor.barcode;

import com.example.electric_storage.domain.common.BarcodeColor;
import lombok.Builder;

@Builder(toBuilder = true)
public record ResistorBarcode(
    String uniqueId,
    String resistorId,
    BarcodeColor color1,
    BarcodeColor color2,
    BarcodeColor color3,
    BarcodeColor color4,
    BarcodeColor color5,
    BarcodeColor color6) {}
