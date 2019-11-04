package com.example.wsp_spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class SignService {
    @Autowired
    private AuthenRepository repository;
    public String doSignIn(String userId,String  passphrase){
        if(userId.equals(repository.select(userId))&&passphrase.equals(repository.select(passphrase))){
            return "true";
        }else{return "false";}
    }

}
