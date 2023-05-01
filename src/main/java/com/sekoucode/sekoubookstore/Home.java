package com.sekoucode.sekoubookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Home {

    @GetMapping("/")
    public String Getgreeting(){
        return "HAPPY BIRTHDAY TO ME!";

    }
}
