package com.example.springboot;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String index() throws Exception {
        logger.info("Handling root mapping request");
        Random r = new Random();

        int diceRoll = r.nextInt(6) +1;

        if (diceRoll >= 3)
            throw new Exception("This is a generic exception");
        
        return "Greetings from Spring Boot!";
    }

}