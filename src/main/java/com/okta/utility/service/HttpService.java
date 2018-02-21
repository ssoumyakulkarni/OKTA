package com.okta.utility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class HttpService {

    public RestTemplate restTemplate;
    public HttpHeaders headers;

    private String baseUrl = "https://dev-497565.oktapreview.com/api/v1/";
    private  String apikey = "00VGZZkHlvvRi9EnjAcipuNPqP4ECzzXRHbHdorify";

    @Autowired
    public HttpService() {
        this.restTemplate = restTemplate();
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        List list = new ArrayList();
        list.add(MediaType.APPLICATION_JSON);
        headers.setAccept(list);
        headers.add("Authorization", "SSWS "+apikey+"");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public ResponseEntity<String> doRequest(String url, HttpMethod method, String requestPayload){


        HttpEntity<String> entity = new HttpEntity<String>(requestPayload, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(this.baseUrl+url, method, entity, String.class, 100);
        return responseEntity;
    }

}
