package com.petrov.filter;

import java.lang.reflect.Array;

public class FilterImpl {
    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] array, Filter<T> filter) {
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = filter.apply(array[i]);
        }
        return newArray;
    }
}
