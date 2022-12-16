package com.emlakcepte.client;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BannerServiceClient {

    public void createBanner(Banner banner){
        String url = "http://localhost:8081/banners";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Banner> request = new HttpEntity<>(banner);
        restTemplate.postForObject(url, request, Banner.class);
    }


}
