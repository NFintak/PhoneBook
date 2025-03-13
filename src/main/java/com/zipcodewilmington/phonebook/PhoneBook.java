package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;
    private List<String> numbers;

    public PhoneBook(Map<String, List<String>> map) {
        this.numbers = new List<>(numbers);
        this.phonebook = new HashMap<>(map);
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        //this.phonebook.put();
    }

    public void addAll(String name, String... phoneNumbers) {

    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return (this.phonebook.get(name) != null);
        //return null;
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
        //return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return
        //return null;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
        //return null;
    }
}
