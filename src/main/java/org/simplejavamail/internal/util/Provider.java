package org.simplejavamail.internal.util;

// FIXME replace with Java 8 solution
public interface Provider<T> {
	T provide();
}