package com.einando.loginjwt.services;

import com.einando.loginjwt.dtos.UserDTORequest;
import com.einando.loginjwt.dtos.UserDTOResponse;
import com.einando.loginjwt.entities.User;
import com.einando.loginjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTOResponse createUser(UserDTORequest dto){
        User newUser = new User(dto);
        User savedUser = repository.save(newUser);
        return new UserDTOResponse(savedUser.getId(), savedUser.getName(), savedUser.getEmail());
    }
}
