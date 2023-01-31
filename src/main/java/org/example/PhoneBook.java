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
        System.out.println(names.size());
        return true;
    }
}
