package com.example.electric_storage.infrastructure.capacitor;

import com.example.electric_storage.domain.capacitor.CapacitorType;
import com.example.electric_storage.domain.common.ValueMultiplier;
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
@Table(name = "capacitor")
public class CapacitorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "capacitor_seq")
  @SequenceGenerator(sequenceName = "capacitor_seq", allocationSize = 1, name = "capacitor_seq")
  private Long id;

  private String uniqueId;
  private double capacitance;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier multiplier;

  private double tolerance;
  private double power;
  private double impedance;

  @Enumerated(EnumType.STRING)
  private CapacitorType capacitorType;
}
