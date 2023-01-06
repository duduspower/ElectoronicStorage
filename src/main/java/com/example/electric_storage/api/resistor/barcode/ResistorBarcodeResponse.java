package com.example.electric_storage.api.resistor.barcode;

import com.example.electric_storage.infrastructure.common.BarcodeColor;

public record ResistorBarcodeResponse(
    String uniqueId,
    String resistorId,
    BarcodeColor color1,
    BarcodeColor color2,
    BarcodeColor color3,
    BarcodeColor color4,
    BarcodeColor color5,
    BarcodeColor color6) {}
