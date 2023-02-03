package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("pavel", 2323);
        phoneBook.add("jeca", 4545);
        phoneBook.add("jeca", 4445);

        System.out.println(phoneBook.findByNumber(2323));
        System.out.println(phoneBook.findByNumber(4545));
        System.out.println(phoneBook.findByNumber(2345));

        System.out.println(phoneBook.findByName("pavel"));
        System.out.println(phoneBook.findByName("jeca"));
        System.out.println(phoneBook.findByName("rico"));

        phoneBook.printAllNames();
    }
}