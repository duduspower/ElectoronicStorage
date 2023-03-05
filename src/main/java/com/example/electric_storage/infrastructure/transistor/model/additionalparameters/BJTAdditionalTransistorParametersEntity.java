package com.example.electric_storage.infrastructure.transistor.model.additionalparameters;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.temperature.BJTTransistorTemperatureEntity;
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
public class BJTAdditionalTransistorParametersEntity implements AdditionalTransistorParametersEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bjt_transistor_parameters_seq")
  @SequenceGenerator(sequenceName = "bjt_transistor_parameters_seq", allocationSize = 1, name = "bjt_transistor_parameters_seq")
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

  @OneToOne(mappedBy = "parameters")
  BJTTransistorTemperatureEntity temperature;
}
// https://datasheetspdf.com/pdf/464962/STMicroelectronics/PN2222A/1
