package com.example.DeadDrop.service;

import com.example.DeadDrop.repository.userRepositary;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    userRepositary userRepositaryy;

    public UserService(userRepositary userRepositaryy){
        this.userRepositaryy=userRepositaryy;
    }
}
