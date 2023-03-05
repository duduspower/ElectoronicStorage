package com.example.electric_storage.infrastructure.transistor.model;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.JFETAdditionalTransistorParametersEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.JFETTransistorPinOutEntity;
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
@Table(name = "jfet_transistor")
public class JFETTransistorEntity implements TransistorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jfet_transistor_seq")
    @SequenceGenerator(sequenceName = "jfet_transistor_seq", allocationSize = 1, name = "jfet_transistor_seq")
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
    private JFETTransistorPinOutEntity pinout;

    @OneToOne
    private JFETAdditionalTransistorParametersEntity additionalParameters;
}
