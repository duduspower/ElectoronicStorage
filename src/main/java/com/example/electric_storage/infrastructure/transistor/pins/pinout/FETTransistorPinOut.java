package com.example.electric_storage.infrastructure.transistor.pins.pinout;

import com.example.electric_storage.infrastructure.transistor.pins.TransistorPinType;
import com.example.electric_storage.infrastructure.transistor.pins.pintype.FETPinType;
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

@Getter
@Setter
@Entity
@Table
class FETTransistorPinOut implements TransistorPinType, TransistorPinOut {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_seq")
  @SequenceGenerator(sequenceName = "transistor_seq", allocationSize = 1, name = "transistor_seq")
  private Long id;

  private String uniqueId;

  @Enumerated(EnumType.STRING)
  private FETPinType pin1;

  @Enumerated(EnumType.STRING)
  private FETPinType pin2;

  @Enumerated(EnumType.STRING)
  private FETPinType pin3;
}
