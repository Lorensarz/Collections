package com.petrov.count_occurrences;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};
        Map<Integer, Integer> result = countOccurrences(array);
        System.out.println(result);
    }

    public static <T> Map<T, Integer> countOccurrences(T[] array) {
        Map<T, Integer> occurrences = new HashMap<>();
        for (T element : array) {
            Integer count = occurrences.getOrDefault(element, 0);
            occurrences.put(element, count + 1);
        }
        return occurrences;
    }
}
