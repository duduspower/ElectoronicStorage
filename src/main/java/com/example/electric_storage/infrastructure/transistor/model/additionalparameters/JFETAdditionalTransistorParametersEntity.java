package com.example.electric_storage.infrastructure.transistor.model.additionalparameters;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.temperature.JFETTransistorTemperatureEntity;
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
@Table(name = "jfet_transistor_parameters")
public class JFETAdditionalTransistorParametersEntity implements AdditionalTransistorParameterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jfet_transistor_parameters_seq")
    @SequenceGenerator(sequenceName = "jfet_transistor_parameters_seq", allocationSize = 1, name = "jfet_transistor_parameters_seq")
    private Long id;

    private String uniqueId;
    private double drainSourceVoltage;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier drainSourceVoltageMultiplier;

    private double gateSourceVoltage;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier gateSourceVoltageMultiplier;

    private double gateCurrent;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier gateCurrentMultiplier;

    @OneToOne(mappedBy = "parameters")
    private JFETTransistorTemperatureEntity temperature;
}
// https://datasheetspdf.com/pdf/1124548/Motorola/2N4222/1
