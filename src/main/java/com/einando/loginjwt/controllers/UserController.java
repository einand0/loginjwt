package com.einando.loginjwt.controllers;

import com.einando.loginjwt.dtos.UserDTORequest;
import com.einando.loginjwt.dtos.UserDTOResponse;
import com.einando.loginjwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserDTOResponse> createUser(@RequestBody UserDTORequest dto){
        UserDTOResponse newUser = service.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
}
