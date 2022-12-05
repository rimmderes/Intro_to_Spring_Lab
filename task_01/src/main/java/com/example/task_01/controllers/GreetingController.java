package com.example.task_01.controllers;


import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

public class GreetingController {

    private Greeting greeting;


    @GetMapping
    public ResponseEntity<Greeting> getGreeting() {
        Greeting greeting = new Greeting("Rimm", "Afternoon");
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

    //   public String greeting(@RequestParam(value = "name") String name) {
    //       return "Good Afternoon " + name;

    // http://localhost:8080/greeting?name=Rimm

    @GetMapping
    public String timeOfDay(@RequestParam(value = "timeOfDay") String timeofDay) {
        return "Good " + timeofDay;
    }

    @GetMapping(value = "/christmas")
        public ResponseEntity<Celebration> getCelebration () {
            Celebration celebration = new Celebration("Merry Christmas!");
            return new ResponseEntity<>(celebration, HttpStatus.OK);
        }


    }


