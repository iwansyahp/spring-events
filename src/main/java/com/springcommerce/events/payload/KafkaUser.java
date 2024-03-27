package com.springcommerce.events.payload;

import java.util.UUID;

public record KafkaUser(UUID uuid, String email, String firstName, String lastName) {}