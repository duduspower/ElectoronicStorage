package com.example.electric_storage.infrastructure.transistor.model.temperature;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.BJTAdditionalTransistorParametersEntity;
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
@Table(name = "bjt_transistor_temperature")
public class BJTTransistorTemperatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_temperature_bjt_seq")
    @SequenceGenerator(sequenceName = "transistor_temperature_bjt_seq", allocationSize = 1, name = "transistor_temperature_bjt_seq")
    private Long id;
    private String uniqueId;
    private double maxOperatingTemperature;
    private double storageTemperature;
    @OneToOne
    private BJTAdditionalTransistorParametersEntity parameters;
}
