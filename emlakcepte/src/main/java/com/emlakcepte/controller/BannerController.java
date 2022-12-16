package com.emlakcepte.controller;

import com.emlakcepte.client.Banner;
import com.emlakcepte.client.BannerServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banners")
public class BannerController {

    @Autowired
    private BannerServiceClient bannerServiceClient;

    @PostMapping
    public ResponseEntity<Banner> create(@RequestBody Banner banner){

        bannerServiceClient.createBanner(banner);
        System.out.println("create() BannerServiceClient :: " + bannerServiceClient);

        return new ResponseEntity<>(banner, HttpStatus.CREATED);
    }


}
