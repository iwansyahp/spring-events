package com.springcommerce.events.payload;

import java.util.Date;
import java.util.UUID;

public record KafkaProduct(Long id, UUID uuid, String name, Float price, Integer availability, boolean active, Date createdData, Date updatedDate, boolean deleted) {}
