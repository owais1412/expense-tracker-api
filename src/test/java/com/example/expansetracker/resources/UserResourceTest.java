package com.example.expansetracker.resources;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

//@ExtendWith(SpringExtension.class)
//@WebMvcTest(UserResource.class)
//@ActiveProfiles("sandbox")
class UserResourceTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void loginUser() throws Exception {
        UserResource userResource = new UserResource(); // Arrange
//        Map<String, Object> userMap = new HashMap<>();
//        userMap.put("email","owes.hussain@gmail.com");
//        userMap.put("password","123456");
        String response = userResource.hello("Owais");// Act
        assertEquals("Hello, New", response);
//        RequestBuilder request = MockMvcRequestBuilders.get("/api/users/hello");
//        MvcResult result = mvc.perform(request).andReturn();
//        assertEquals("Hello", result.getResponse().getContentAsString());
    }

    @Test
    void loginUserWithWrongPassword() {
        UserResource userResource = new UserResource();
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("email","owes.hussain@gmail.com");
        userMap.put("password","12345");
        ResponseEntity<Map<String,String>> response = userResource.loginUser(userMap);
    }

    @Test
    void loginUserWithWrongEmail() {
        UserResource userResource = new UserResource();
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("email","oweshussain@gmail.com");
        userMap.put("password","123456");
        ResponseEntity<Map<String,String>> response = userResource.loginUser(userMap);
    }

    @Test
    void registerUser() {
    }
}