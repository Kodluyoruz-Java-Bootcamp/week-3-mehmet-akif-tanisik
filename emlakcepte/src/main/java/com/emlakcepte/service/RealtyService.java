package com.emlakcepte.service;

import com.emlakcepte.client.Banner;
import com.emlakcepte.client.BannerServiceClient;
import com.emlakcepte.model.Realty;
import com.emlakcepte.model.User;
import com.emlakcepte.model.enums.RealtyCategory;
import com.emlakcepte.model.enums.RealtyPublishStatus;
import com.emlakcepte.model.enums.RealtyType;
import com.emlakcepte.model.enums.UserType;
import com.emlakcepte.repository.RealtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyService {

    @Autowired
    private RealtyRepository realtyRepository;

    public void createRealty(Realty realty){

       realtyRepository.saveRealty(realty);
    }

    public List<Realty> getAll(){
        return realtyRepository.findAll();
    }

    public void printAll(List<Realty> realtyList){
        realtyList.forEach(System.out::println);
    }

    public List<Realty> getAllByProvince(String province){
        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province)).toList();
    }

    public List<Realty> getAllByProvinceAndDistrict(String province, String district){
        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .filter(realty -> realty.getDistrict().equalsIgnoreCase(district)).toList();
    }

    public List<Realty> getAllByUserName(String email){
        return getAll().stream()
                .filter(realty -> realty.getUser().getEmail().equals(email))
                .toList();
    }

    public List<Realty> getActiveRealtyByUserName(String email){

        return getAll().stream()
                .filter(realty -> realty.getUser().getName().equals(email))
                .filter(realty -> RealtyPublishStatus.ACTIVE.equals(realty.getStatus()))
                .toList();
    }

    public long getRealtyNumberInProvince(String province){

        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .count();
    }

    public long getRealtyNumberInProvince(List<String> provinces){
        return getAll().stream()
                .filter(realty -> provinces.contains(realty.getProvince()))
                .count();
    }

    public long getHouseNumbersInProvince(String province){

        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .filter(realty -> realty.getRealtyType().equals(RealtyType.HOUSE))
                .filter(realty -> realty.getCategory().equals(RealtyCategory.SALE))
                .count();
    }

    public List<Realty> showcaseProvince(String province){
        return getAll().stream().filter(realty -> realty.getProvince().equals(province)).limit(10).toList();
    }



}

