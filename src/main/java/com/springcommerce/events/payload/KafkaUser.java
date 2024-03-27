package com.springcommerce.events.payload;

public record KafkaUser(Long id, String email, String firstName, String lastName) {}