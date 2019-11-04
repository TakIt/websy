package com.example.wsp_spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;

import java.util.List;

@Service
public class RetrospectService {

    @Autowired
    private RetrospectRepository repository;

    public String register(String text){
        var retrospect = new Retrospect(text);
        try{
            return repository.insert(retrospect)+"件を追加";
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return "追加失敗";
    }

    public List<Retrospect>findAll(){
        try{
            return repository.select();
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return emptyList();
    }
}
