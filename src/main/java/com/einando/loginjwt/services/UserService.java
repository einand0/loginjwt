package com.einando.loginjwt.services;

import com.einando.loginjwt.entities.User;
import com.einando.loginjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(User user){
        return repository.save(user);
    }
}
