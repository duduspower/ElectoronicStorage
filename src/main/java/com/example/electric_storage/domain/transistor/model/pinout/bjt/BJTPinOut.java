package com.example.electric_storage.domain.transistor.model.pinout.bjt;

import com.example.electric_storage.infrastructure.transistor.model.BJTTransistorEntity;
import com.example.electric_storage.infrastructure.transistor.model.pinout.pintype.BJTPinType;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class BJTPinOut {
     String uniqueId;

     BJTPinType pin1;

     BJTPinType pin2;

     BJTPinType pin3;

     BJTTransistorEntity transistor;
}
