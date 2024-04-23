package com.petrov.filter;

import static com.petrov.filter.FilterImpl.filter;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Filter<Integer> filter = new Filter<Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };
        Integer[] filteredNumbers = filter(numbers, filter);
        for (Integer num : filteredNumbers) {
            System.out.println(num);
        }
    }
}
