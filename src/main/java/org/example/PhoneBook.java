package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {
    private SortedMap<String, Integer> contacts = new TreeMap<>();
    private Map<Integer, String> contactsNum = new HashMap<>();

    public int add(String name, int number) {
        if (!contacts.containsKey(name) && !contactsNum.containsKey(number)) {
            contacts.put(name, number);
            contactsNum.put(number, name);
            return contacts.size();
        }
        System.out.println("there is such a name");
        return contacts.size();
    }

    public String findByNumber(int number) {
        if (contactsNum.containsKey(number)) {
            return contactsNum.get(number);
        }
        return null;
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
