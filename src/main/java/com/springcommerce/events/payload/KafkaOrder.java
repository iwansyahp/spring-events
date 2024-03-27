package com.springcommerce.events.payload;

import java.util.Date;
import java.util.UUID;

public record KafkaOrder(UUID id, String orderName, Float totalPay, String status, Date createdAt, Date updatedAt) {}
