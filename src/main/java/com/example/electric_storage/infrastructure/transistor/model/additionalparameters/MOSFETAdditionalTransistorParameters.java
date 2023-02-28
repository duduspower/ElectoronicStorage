package com.example.electric_storage.infrastructure.transistor.model.additionalparameters;

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
@Table(name = "mosfet_transistor_parameters")
public class MOSFETAdditionalTransistorParameters implements AdditionalTransistorParameters {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_seq")
  @SequenceGenerator(sequenceName = "transistor_seq", allocationSize = 1, name = "transistor_seq")
  private Long id;

  private String uniqueId;
  double drainSourceVoltage;

  @Enumerated(EnumType.STRING)
  ValueMultiplier drainSourceVoltageMultiplier;

  double gateSourceVoltageContinuous;

  @Enumerated(EnumType.STRING)
  ValueMultiplier gateSourceVoltageContinuousMultiplier;

  double drainContinuousCurrent;

  @Enumerated(EnumType.STRING)
  ValueMultiplier drainContinuousCurrentMultiplier;

  @OneToOne(mappedBy = "temperature")
  TransistorTemperature temperature;
}
// https://datasheetspdf.com/pdf/1020668/InchangeSemiconductor/2SK617/1
