package com.example.electric_storage.infrastructure.fuse;

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
@Table(name = "fuse")
public class FuseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fuse_seq")
  @SequenceGenerator(sequenceName = "fuse_seq", allocationSize = 1, name = "fuse_seq")
  private Long id;

  private String uniqueId;

  @Enumerated(EnumType.STRING)
  FuseType type;

  private double value;

  @Enumerated(EnumType.STRING)
  ValueMultiplier multiplier;
}
