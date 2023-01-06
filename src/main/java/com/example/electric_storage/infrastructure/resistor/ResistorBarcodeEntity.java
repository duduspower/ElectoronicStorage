package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.infrastructure.common.BarcodeColor;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
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

  @Enumerated(EnumType.STRING)
  private BarcodeColor firstBarcode;

  @Enumerated(EnumType.STRING)
  private BarcodeColor secondBarcode;

  @Enumerated(EnumType.STRING)
  private BarcodeColor thirdBarcode;

  @Enumerated(EnumType.STRING)
  private BarcodeColor fourthBarcode;

  @Enumerated(EnumType.STRING)
  private BarcodeColor fifthBarcode;
}
