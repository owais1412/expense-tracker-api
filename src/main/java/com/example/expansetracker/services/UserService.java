package com.example.expansetracker.services;

import com.example.expansetracker.domain.User;
import com.example.expansetracker.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName,String lastName,String email, String password) throws EtAuthException;
}
