package com.example.electric_storage.infrastructure.inductor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
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
@Table(name = "inductor")
public class InductorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inductor_seq")
  @SequenceGenerator(sequenceName = "inductor_seq", allocationSize = 1, name = "inductor_seq")
  private Long id;

  private String uniqueId;
  private double inductance;

  @Enumerated(EnumType.STRING)
  ValueMultiplier inductanceMultiplier;

  private double tolerance;
  private double selfResonantFrequency;

  @Enumerated(EnumType.STRING)
  ValueMultiplier selfResonantFrequencyMultiplier;

  private double dcResistance;
  private double ratedCurrent;
  boolean withCore;
}
