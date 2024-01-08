package com.ecommerce.notificationservice.event;

import com.fasterxml.jackson.databind.deser.Deserializers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent{
    private String orderNumber;
}
