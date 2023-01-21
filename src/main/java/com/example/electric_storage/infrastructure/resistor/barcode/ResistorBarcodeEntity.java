package com.example.electric_storage.infrastructure.resistor.barcode;

import com.example.electric_storage.domain.common.BarcodeColor;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "resistor_barcode")
public class ResistorBarcodeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resistor_barcode_seq")
  @SequenceGenerator(
      sequenceName = "resistor_barcode_seq",
      allocationSize = 1,
      name = "resistor_barcode_seq")
  private Long id;

  private String uniqueId;

  private String resistorId;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color1;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color2;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color3;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color4;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color5;

  @Enumerated(EnumType.ORDINAL)
  private BarcodeColor color6;
}
