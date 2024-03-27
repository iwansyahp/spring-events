package com.springcommerce.payload;

import java.util.Date;
import java.util.UUID;

public record Product(Long id, UUID uuid, String name, Float price, Integer availability, boolean active, Date createdData, Date updatedDate, boolean deleted) {}
