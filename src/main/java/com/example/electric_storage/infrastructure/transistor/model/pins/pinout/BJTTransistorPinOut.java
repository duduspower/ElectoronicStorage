package com.example.electric_storage.infrastructure.transistor.model.pins.pinout;

import com.example.electric_storage.infrastructure.transistor.model.pins.TransistorPinType;
import com.example.electric_storage.infrastructure.transistor.model.pins.pintype.BJTPinType;
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
@Table(name = "bjt_transistor_pinout")
class BJTTransistorPinOut implements TransistorPinType, TransistorPinOut {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_seq")
  @SequenceGenerator(sequenceName = "transistor_seq", allocationSize = 1, name = "transistor_seq")
  private Long id;

  private String uniqueId;

  @Enumerated(EnumType.STRING)
  private BJTPinType pin1;

  @Enumerated(EnumType.STRING)
  private BJTPinType pin2;

  @Enumerated(EnumType.STRING)
  private BJTPinType pin3;
}
