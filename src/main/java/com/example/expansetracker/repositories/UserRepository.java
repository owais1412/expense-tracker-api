package com.example.expansetracker.repositories;

import com.example.expansetracker.domain.User;
import com.example.expansetracker.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName,String lastName,String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
