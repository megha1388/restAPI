package com.example.restAPI.controller;

import com.example.restAPI.api.Person;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person = new Person();
        person.setFirstName("Diyaan");
        person.setAddress("USA");
        person.setLastName("patel");
        person.setGender("male");
        person.setAge(1);
        people.add(person);


    }
}
