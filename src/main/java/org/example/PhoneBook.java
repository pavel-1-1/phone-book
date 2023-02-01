package org.example;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<String> names = new ArrayList<>();
    private final List<Integer> numbers = new ArrayList<>();

    public boolean add(String name, int number) {
        if (names.contains(name)) {
            return false;
        } else {
            names.add(name);
            numbers.add(number);
        }
        return true;
    }

    public String findByNumber(int number) {
        if (numbers.contains(number)) {
            return names.get(numbers.indexOf(number));
        }
        return null;
    }
}
