package com.example.electric_storage.infrastructure.transistor.model.pinout;

import com.example.electric_storage.infrastructure.transistor.model.BJTTransistorEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.BJTPinType;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.TransistorPinType;
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
@Table(name = "bjt_transistor_pinout")
public
class BJTTransistorPinOutEntity implements TransistorPinType, TransistorPinOutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bjt_transistor_pinout_seq")
    @SequenceGenerator(sequenceName = "bjt_transistor_pinout_seq", allocationSize = 1, name = "bjt_transistor_pinout_seq")
    private Long id;

    private String uniqueId;

    @Enumerated(EnumType.STRING)
    private BJTPinType pin1;

    @Enumerated(EnumType.STRING)
    private BJTPinType pin2;

    @Enumerated(EnumType.STRING)
    private BJTPinType pin3;

    @OneToOne(mappedBy = "pinout")
    private BJTTransistorEntity transistor;
}
