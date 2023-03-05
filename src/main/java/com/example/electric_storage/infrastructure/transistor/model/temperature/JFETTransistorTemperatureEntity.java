package com.example.electric_storage.infrastructure.transistor.model.temperature;

import com.example.electric_storage.infrastructure.transistor.model.additionalparameters.JFETAdditionalTransistorParametersEntity;
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
@Table(name = "jfet_transistor_temperature")
public class JFETTransistorTemperatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transistor_temperature_jfet_seq")
    @SequenceGenerator(sequenceName = "transistor_temperature_jfet_seq", allocationSize = 1, name = "transistor_temperature_jfet_seq")
    private Long id;
    private String uniqueId;
    private double maxOperatingTemperature;
    private double storageTemperature;
    @OneToOne
    private JFETAdditionalTransistorParametersEntity parameters;
}
