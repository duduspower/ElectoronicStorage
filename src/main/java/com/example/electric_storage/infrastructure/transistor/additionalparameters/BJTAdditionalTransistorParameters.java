package com.example.electric_storage.infrastructure.transistor.additionalparameters;

import com.example.electric_storage.domain.common.ValueMultiplier;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "bjt_transistor_parameters")
public class BJTAdditionalTransistorParameters implements AdditionalTransistorParameters {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_seq")
  @SequenceGenerator(sequenceName = "transistor_seq", allocationSize = 1, name = "transistor_seq")
  private Long id;

  private String uniqueId;
  double collectorEmiterVoltageWithEmiterVoltageEqualsZero;

  @Enumerated(EnumType.STRING)
  ValueMultiplier collectorEmiterVoltageWithEmiterVoltageEqualsZeroMultiplier;

  double collectorEmiterVoltageWithBaseVoltageEqualsZero;

  @Enumerated(EnumType.STRING)
  ValueMultiplier collectorEmiterVoltageWithBaseVoltageEqualsZeroMultiplier;

  double emiterBaseVoltage;

  @Enumerated(EnumType.STRING)
  ValueMultiplier emiterBaseVoltageMultiplier;

  double collectorCurrent;

  @Enumerated(EnumType.STRING)
  ValueMultiplier collectorCurrentMultiplier;

  double collectorPeakCurrent;

  @Enumerated(EnumType.STRING)
  ValueMultiplier collectorPeakCurrentMultiplier;

  @OneToOne(mappedBy = "temperature")
  TransistorTemperature temperature;
}
// https://datasheetspdf.com/pdf/464962/STMicroelectronics/PN2222A/1
