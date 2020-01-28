package com.example.restAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController()
@RequestMapping(path = "/megha")
public class ControllerRestAPI {
    @GetMapping("/patel")
    public String sayhi() {
        return "hi";
    }

    @GetMapping("/hello")
    public String sayhello() {
        return "hello";
    }

    @GetMapping("/map")
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Alphabet", "abc");
        map.put("Numbers", "1234");
        map.put("Symbol", "!@#");
        return map;

    }

}
