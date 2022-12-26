package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.infrastructure.common.BarcodeColor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ResistorBarcodeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String uniqueId;

  @Column(name = "1_barcode")
  @Enumerated
  private BarcodeColor firstBarcode;

  @Column(name = "2_barcode")
  @Enumerated
  private BarcodeColor secondBarcode;

  @Column(name = "3_barcode")
  @Enumerated
  private BarcodeColor thirdBarcode;

  @Column(name = "4_barcode")
  @Enumerated
  private BarcodeColor fourthBarcode;

  @Column(name = "5_barcode")
  @Enumerated
  private BarcodeColor fifthBarcode;
}
