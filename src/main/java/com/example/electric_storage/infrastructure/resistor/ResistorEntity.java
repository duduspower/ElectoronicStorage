package com.example.electric_storage.infrastructure.resistor;

import com.example.electric_storage.infrastructure.common.ValueMultiplier;
import jakarta.persistence.Entity;
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
@Table(name = "resistor")
public class ResistorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resistor_seq")
  @SequenceGenerator(sequenceName = "resistor_seq", allocationSize = 1, name = "resistor_seq")
  private Long id;

  private String uniqueId;

  private int resistance;
  @Enumerated private ValueMultiplier multiplier;
  private float tolerance;
  private float power;
}
