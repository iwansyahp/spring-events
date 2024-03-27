package com.springcommerce.payload;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload<T> {
	private String key;
	private T data;

	@JsonCreator
	public Payload(@JsonProperty("key") String key, @JsonProperty("data") T product) {
		super();
		this.key = key;
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "KafkaEventPayload [key=" + key + ", data=" + data + "]";
	}
}