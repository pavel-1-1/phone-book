package org.example;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {
    SortedMap<String, Integer> contacts = new TreeMap<>();

    public int add(String name, int number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            return contacts.size();
        }
        System.out.println("there is such a name");
        return contacts.size();
    }

    public String findByNumber(int number) {
        if (contacts.containsValue(number)) {
            return contacts.entrySet().stream().filter(n -> n.getValue().equals(number)).map(Map.Entry::getKey).findFirst().get();
        }
        return "null";
    }

    public int findByName(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        }
        return 0;
    }

    public void printAllNames() {
        contacts.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
