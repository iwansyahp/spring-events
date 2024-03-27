package com.springcommerce.events.payload;

public class KafkaPayload<V> {
	private String key;
	private V data;

	public KafkaPayload(String key, V data) {
		this.key = key;
		this.data = data;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public V getData() {
		return data;
	}
	public void setData(V data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "KafkaPayload [key=" + key + ", data=" + data + "]";
	}
}
