
package com.example.restapi.number;

import com.example.restapi.user.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class idControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private Random stubRandom;

    @Test
    void generateId() {
        when(stubRandom.nextInt(10)).thenReturn(7);

        ResponseModel result = restTemplate.getForObject("/id", ResponseModel.class);
        assertEquals("XYZ7", result.getId());
    }

    @Test
    void suucess_with_getUser() {
        UserResponse result = restTemplate.getForObject("/user", UserResponse.class);
        assertEquals("Fake name", result.getName());
        assertEquals("Fake username", result.getUsername());
    }
}