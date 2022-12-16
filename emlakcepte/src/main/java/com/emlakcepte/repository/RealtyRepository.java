package com.emlakcepte.repository;

import com.emlakcepte.model.Realty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RealtyRepository {

    @Autowired
    private static List<Realty> realtyList = new ArrayList<>();

    public void saveRealty(Realty realty){
        realtyList.add(realty);
    }

    public List<Realty> findAll(){
        return realtyList;
    }


}
