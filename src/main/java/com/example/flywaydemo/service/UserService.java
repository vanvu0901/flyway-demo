package com.example.flywaydemo.service;

import com.example.flywaydemo.domain.User;

public interface UserService {

    User createUser(User user) throws Exception;
    
    User updateUser(User user) throws Exception;
    
    User deleteUser(Long id) throws Exception;

    User listUsers() throws Exception;
}
