package com.sekoucode.sekoubookstore;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("integration")
class  SekouBookStoreApplicationTests {

    @Test
    void contextLoads() {
    }

}