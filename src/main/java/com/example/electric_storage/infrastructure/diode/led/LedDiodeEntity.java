package com.example.electric_storage.infrastructure.diode.led;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.domain.diode.led.LedColor;
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
@Table(name = "led_diode")
public class LedDiodeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "led_diode_seq")
  @SequenceGenerator(sequenceName = "led_diode_seq", allocationSize = 1, name = "led_diode_seq")
  private Long id;

  private String uniqueId;

  @Enumerated(EnumType.STRING)
  private LedColor color;

  private double voltage;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier voltageMultiplier;

  private double luxPower;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier powerMultiplier;

  private double current;

  @Enumerated(EnumType.STRING)
  private ValueMultiplier currentMultiplier;
}
