package com.petrov.filter;

public interface Filter<T> {
    T apply(T o);
}
