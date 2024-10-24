package com.example.identity.servicce.service;

import com.example.identity.servicce.entity.User;
import com.example.identity.servicce.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;
    public User createRequest(Object request){
    }
}
