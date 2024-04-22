package com.loginauthapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUsers(){
        return ResponseEntity.ok("sucess!");
    }
}
