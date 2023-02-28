package com.example.electric_storage.infrastructure.transistor;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.additionalparameters.AdditionalTransistorParameters;
import com.example.electric_storage.infrastructure.transistor.pins.pinout.TransistorPinOut;
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
@Table(name = "transistor")
public class TransistorEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_seq")
  @SequenceGenerator(sequenceName = "transistor_seq", allocationSize = 1, name = "transistor_seq")
  private Long id;

  private String uniqueId;
  private TransistorPackage transistorPackage;
  private TransistorType transistorType;

  private double maxVoltage;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier maxVoltageMultiplier;

  private double maxCurrent;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier maxCurrentMultiplier;

  private double maxPower;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier maxPowerMultiplier;

  @OneToOne(mappedBy = "pinout")
  private TransistorPinOut pinout;

  @OneToOne(mappedBy = "additionalParameters")
  private AdditionalTransistorParameters additionalParameters;
}
