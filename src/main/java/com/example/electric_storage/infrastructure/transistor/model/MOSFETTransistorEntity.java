package com.example.electric_storage.infrastructure.transistor.model;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.MOSFETAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.MOSFETTransistorPinOutEntity;
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
@Table(name = "mosfet_transistor")
public class MOSFETTransistorEntity implements TransistorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mosfet_transistor")
    @SequenceGenerator(sequenceName = "mosfet_transistor", allocationSize = 1, name = "mosfet_transistor")
    private Long id;

    private String uniqueId;
    @Enumerated(EnumType.STRING)
    private TransistorPackage transistorPackage;
    @Enumerated(EnumType.STRING)
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

    @OneToOne
    private MOSFETTransistorPinOutEntity pinout;

    @OneToOne
    private MOSFETAdditionalTransistorParametersEntity additionalParameters;
}

