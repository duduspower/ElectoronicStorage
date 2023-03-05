package com.example.electric_storage.infrastructure.transistor.model.pinout;

import com.example.electric_storage.infrastructure.transistor.model.MOSFETTransistorEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.FETPinType;
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

@Getter
@Setter
@Entity
@Table(name = "mosfet_transistor_pinout")
public class MOSFETTransistorPinOutEntity implements TransistorPinOutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mosfet_transistor_pinout_seq")
    @SequenceGenerator(sequenceName = "mosfet_transistor_pinout_seq", allocationSize = 1, name = "mosfet_transistor_pinout_seq")
    private Long id;

    private String uniqueId;

    @Enumerated(EnumType.STRING)
    private FETPinType pin1;

    @Enumerated(EnumType.STRING)
    private FETPinType pin2;

    @Enumerated(EnumType.STRING)
    private FETPinType pin3;

    @OneToOne(mappedBy = "pinout")
    private MOSFETTransistorEntity transistor;
}
