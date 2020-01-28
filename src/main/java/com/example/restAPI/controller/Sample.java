package com.example.restAPI.controller;

import com.example.restAPI.api.Person;

import java.awt.*;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
//        int[] a= {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(a.length);
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        int[] b= {11,12,13,14,15,16,17,18,19,20};
        System.out.println(b.length);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


        String[] name = {"test","test1","test2"};
        System.out.println("number of name => "+name.length);

        for (int x=0;x<name.length;x++){
            System.out.println(name[x]);
        }

        for(String s:name) {
            System.out.println(s);
        }

        //Collections

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");

        for (String h:list) {
            System.out.println(h);
        }

        list.forEach(i->{System.out.println(i);});

        List<String> son = new ArrayList<>();
        son.add("Diyaan");
        for (String d:son){
            System.out.println(d);
        }

        SetExercise();

        Set<String> set1 = new TreeSet<>();
        set1.add("good morning");
        set1.add("good morning");
        set1.add("good afternoon");
        set1.add("good evening");
        set1.add("good night");
        for (String g: set1){
            System.out.println(g);
        }

        Map<Integer,Person> map = new HashMap<>();
        for(int i=0;i<3;i++){
            Person person = new Person();
            person.setFirstName("megha");
            person.setLastName("patel");
            person.setAge(30);
            person.setGender("female");
            person.setAddress("chicago");
            map.put(i,person);
        }
        Person person = new Person();
        person.setFirstName("karthikeyan");
        person.setLastName("Sethuraman");
        person.setAge(30);
        person.setGender("male");
        person.setAddress("india");
        map.put(0,person);

        for(Integer i:map.keySet()){
            System.out.println(i+" ==> "+map.get(i).getFirstName()+","+map.get(i).getLastName());
        }

        String [] s={"meg","meg1","meg3"};
        System.out.println(s.length);
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }


        int [] k= {1,2,3,4,5};
        System.out.println(k.length);
        for (int i=0; i<k.length; i++) {
            System.out.println(k [i]);
        }

        float [] f = {10.10f, 30.3f, 40.60f, 77.50f};
                System.out.println("Java float Array");
        for (int i=0;i<f.length;i++){
            System.out.println("Element at Index : "+ i + " " + f[i]);
        }

        Boolean[] boolArray = new Boolean[5]; // initialize a boolean array
        for(int i = 0; i < boolArray.length; i++) {
            System.out.println(boolArray[i]);
        }

        Arrays.fill(boolArray, Boolean.FALSE);
        // all the values will be false
        for(int i = 0; i < boolArray.length; i++) {
            System.out.println(boolArray[i]);
        }

        Arrays.fill(boolArray, Boolean.TRUE);
        // all the values will be true
        for (int i = 0; i < boolArray.length; i++) {
            System.out.println(boolArray[i]);
        }


    }

    private static void SetExercise() {
        Set<String> set = new HashSet<>();
        set.add("hi");
        set.add("hi");
        for (String h:set){
            System.out.println(h);
        }
    }
}
