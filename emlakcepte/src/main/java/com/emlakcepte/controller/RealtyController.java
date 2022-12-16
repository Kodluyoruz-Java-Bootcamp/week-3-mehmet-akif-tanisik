package com.emlakcepte.controller;

import com.emlakcepte.model.Realty;
import com.emlakcepte.service.RealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/realties")
public class RealtyController {

    @Autowired
    private RealtyService realtyService;

    @GetMapping
    public List<Realty> getAll(){

        System.out.println("getAll() RealtyService :: " + realtyService);
        return realtyService.getAll();

    }

    @PostMapping
    public ResponseEntity<Realty> create(@RequestBody Realty realty){

        realtyService.createRealty(realty);
        System.out.println("create() RealtyService :: " + realtyService);

        return new ResponseEntity<>(realty, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/province/{province}", method = RequestMethod.GET)
    public List<Realty> getAllByProvince(@PathVariable String province){

        System.out.println("getAllByProvince() RealtyService :: " + realtyService);
        return realtyService.getAllByProvince(province);

    }

    @GetMapping(value ="/province/district/{province}/{district}")
    public List<Realty> getAllByProvinceAndDistrict(@PathVariable String province, @PathVariable String district){

        System.out.println("getAllByProvinceAndDistrict() RealtyService :: " + realtyService);
        return realtyService.getAllByProvinceAndDistrict(province,district);
    }

    @GetMapping(value ="/email/{email}")
    public List<Realty> getAllByUserName(@PathVariable String email){

        System.out.println("getAllByUserName() RealtyService :: " + realtyService);
        return realtyService.getAllByUserName(email);
    }

    @GetMapping(value ="/active/{email}")
    public List<Realty> getActiveRealtyByUserName(@PathVariable String email){
        System.out.println("getActiveRealtyByUserName() RealtyService :: " + realtyService);
        return realtyService.getActiveRealtyByUserName(email);
    }

    @GetMapping(value ="/realtyNumber/{province}")
    public long getRealtyNumberInProvince(@PathVariable String province){

        System.out.println("getRealtyNumberInProvince() RealtyService :: " + realtyService);
        return realtyService.getRealtyNumberInProvince(province);
    }

    @GetMapping(value ="/saleHouseNumber/{province}")
    public long getHouseNumbersInProvince(@PathVariable String province){

        System.out.println("getHouseNumbersInProvince() RealtyService :: " + realtyService);
        return realtyService.getHouseNumbersInProvince(province);
    }

    @GetMapping(value ="/showcase/{province}")
    public List<Realty> showcaseProvince(@PathVariable String province){
        System.out.println("getAllByUserName() RealtyService :: " + realtyService);
        return realtyService.showcaseProvince(province);
    }

}
