package com.sekoucode.sekoubookstore;

import com.sekoucode.sekoubookstore.config.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    private final PolarProperties polarProperties;

    public Home(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String Getgreeting(){
       return polarProperties.getGreeting();

    }
}
