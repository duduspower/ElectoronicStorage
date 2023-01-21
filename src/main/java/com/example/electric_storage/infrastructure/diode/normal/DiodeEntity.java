package com.example.electric_storage.infrastructure.diode.normal;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.diode.normal.DiodeType;
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
@Table(name = "diode")
public class DiodeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diode_seq")
  @SequenceGenerator(sequenceName = "diode_seq", allocationSize = 1, name = "diode_seq")
  private Long id;

  private String uniqueId;

  @Enumerated(EnumType.STRING)
  private DiodeType type;

  private double resistance;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier resistanceMultiplier;

  private double capacitance;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier capacitanceMultiplier;

  private double saturationCurrent;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier saturationCurrentMultiplier;

  private double forwardVoltage;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier forwardVoltageMultiplier;

  private double backwardVoltage;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier backwardVoltageMultiplier;
}
