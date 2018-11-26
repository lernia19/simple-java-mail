package org.simplejavamail.internal.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.ws.Provider;

public class SimpleOptional<T> {
	private final T value;
	
	public SimpleOptional(T value) {
		this.value = value;
	}
	
	public static <T> SimpleOptional<T> ofNullable(@Nullable T value) {
		return new SimpleOptional<>(value);
	}
	
	public T orElse(@Nonnull T otherValue) {
		return value != null ? value : otherValue;
	}
	
	public T orElse(@Nonnull Provider<T> otherValueProvider) {
		return value != null ? value : otherValueProvider.provide();
	}
	
	public interface Provider<T> {
		T provide();
	}
}