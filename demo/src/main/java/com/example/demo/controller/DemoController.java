package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
@RequestMapping(path = "test")
public class DemoController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getDemo() {
        Map<String, String> response = new HashMap<String, String>();
        response.put("healthcheck", "available");
        response.put("springboot", "springboot");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
