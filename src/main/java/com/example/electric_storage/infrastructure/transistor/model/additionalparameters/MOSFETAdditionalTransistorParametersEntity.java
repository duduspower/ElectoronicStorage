package com.example.electric_storage.infrastructure.transistor.model.additionalparameters;

import com.example.electric_storage.domain.common.ValueMultiplier;
import com.example.electric_storage.infrastructure.transistor.model.temperature.MOSFETTransistorTemperatureEntity;
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
public class MOSFETAdditionalTransistorParametersEntity implements AdditionalTransistorParameterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mosfet_transistor_parameters_seq")
    @SequenceGenerator(sequenceName = "mosfet_transistor_parameters_seq", allocationSize = 1, name = "mosfet_transistor_parameters_seq")
    private Long id;

    private String uniqueId;
    private double drainSourceVoltage;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier drainSourceVoltageMultiplier;

    private double gateSourceVoltageContinuous;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier gateSourceVoltageContinuousMultiplier;

    private double drainContinuousCurrent;

    @Enumerated(EnumType.STRING)
    private ValueMultiplier drainContinuousCurrentMultiplier;

    @OneToOne(mappedBy = "parameters")
    private MOSFETTransistorTemperatureEntity temperature;
}
// https://datasheetspdf.com/pdf/1020668/InchangeSemiconductor/2SK617/1
