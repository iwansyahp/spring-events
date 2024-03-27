package com.springcommerce.events.payload;

public class KafkaPayload<T> {
	private String key;
	private T data;

	public KafkaPayload(String key, T data) {
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
		return "KafkaPayload [key=" + key + ", data=" + data + "]";
	}
}
