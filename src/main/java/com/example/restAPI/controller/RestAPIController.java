package com.example.restAPI.controller;

import com.example.restAPI.api.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/person")
public class RestAPIController {
    List<Person> people = new ArrayList<>();
    @GetMapping("/hello")
    public String sayHi(){
       return "hello";
    }

    @GetMapping("/json")
    public Map<String,String> getJSON() {
        Map<String,String> map = new HashMap<>();
        map.put("firstName","megha");
        map.put("lastname","patel");
        return map;
    }

    @GetMapping("/people")
    public List<Person> listOfPerson(){
        if(people.isEmpty()) {
            Person person = new Person();
            person.setFirstName("megha");
            person.setLastName("patel");
            person.setAge(30);
            person.setGender("female");
            person.setAddress("chicago");
            people.add(person);
        }

        return people;
    }
    @PostMapping("/people")
    public String addPerson(@RequestBody Person parameter){
        people.add(parameter);
        return "successfully added person to the list";
    }

    @DeleteMapping("/people")
    public String removePerson(@RequestParam(name = "firstName") String firstName,@RequestParam(name ="lastName") String lastName){
        int index = findIndexByName(firstName,lastName);
        if(index != -1){
            people.remove(index);
            return "delete person object from the list";
        }
        else{
            return "delete person is not available from the list";
        }
    }

    @PutMapping("/people")
    public String putPerson(@RequestBody Person person){
        int index = findIndexByName(person.getFirstName(),person.getLastName());
        if(index != -1) {
            people.set(index,person);
            return "modified person object from the list";
        }
        else {
            people.add(person);
            return "added person object from the list";
        }
    }

    private int findIndexByName(String firstName, String lastName) {
        for (int i=0;i<people.size();i++){
            if(people.get(i).getFirstName().equals(firstName) && people.get(i).getLastName().equals(lastName))
                return i;
        }
        return -1;
    }

}
