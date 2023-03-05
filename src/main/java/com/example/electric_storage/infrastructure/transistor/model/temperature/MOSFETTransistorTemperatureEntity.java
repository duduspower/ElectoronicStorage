package com.example.electric_storage.infrastructure.transistor.model.temperature;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.MOSFETAdditionalTransistorParametersEntity;
import jakarta.persistence.Entity;
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
@Table(name = "mosfet_transistor_temperature")
public class MOSFETTransistorTemperatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mosfet_transistor_temperature_seq")
    @SequenceGenerator(sequenceName = "mosfet_transistor_temperature_seq", allocationSize = 1, name = "mosfet_transistor_temperature_seq")
    private Long id;
    private String uniqueId;
    private double maxOperatingTemperature;
    private double storageTemperature;
    @OneToOne
    private MOSFETAdditionalTransistorParametersEntity parameters;
}
