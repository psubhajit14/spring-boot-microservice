package com.ecommerce.notificationservice.deserializer;

import com.ecommerce.notificationservice.event.OrderPlacedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class OrderPlacedEventDeserializer implements Deserializer<OrderPlacedEvent> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // Configure your deserializer (if needed)
    }

    @Override
    public OrderPlacedEvent deserialize(String topic, byte[] data) {
        try {
            // Deserialize the byte array into YourCustomPojo
            return objectMapper.readValue(data, OrderPlacedEvent.class);
        } catch (IOException e) {
            throw new RuntimeException("Error deserializing Kafka message", e);
        }
    }

    @Override
    public void close() {
        // Close any resources if needed
    }
}
