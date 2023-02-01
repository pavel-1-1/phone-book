package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        boolean contact;
        System.out.println(contact = phoneBook.add("pavel", 2323));
        System.out.println(contact = phoneBook.add("jeca", 4545));
        System.out.println(contact = phoneBook.add("jeca", 4445));

        System.out.println(phoneBook.findByNumber(2323));
        System.out.println(phoneBook.findByNumber(4545));
        System.out.println(phoneBook.findByNumber(2345));
    }
}