package com.okta.user.service;

import com.okta.utility.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserApiServiceImpl implements  UserApiService {

    public HttpService httpService;

    @Autowired
    public UserApiServiceImpl(HttpService httpService){
        this.httpService = httpService;
    }

    @Override
    public void createUserWithoutCredentials(String payload, String queryString) {

    }

    @Override
    public void createUserWithRecoveryQuestion(String payload, String queryString) {

    }

    @Override
    public void createUserWithPassword(String payload, String queryString) {

    }

    @Override
    public void createUserWithHashedPassword(String payload, String queryString) {

    }

    @Override
    public void createUserWithPasswordAndRecoveryQuestion(String payload, String queryString) {

    }

    @Override
    public void createUserWithAuthenticationProvider(String payload, String queryString) {

    }

    @Override
    public void createUserInGroup(String payload, String queryString) {

    }

    public String getCurrentUser() {
        String url = "users/sasi.kelam@beyondid.com";
        String body = "{\n" +
                "  \"profile\": {\n" +
                "    \"firstName\": \"Isaac\",\n" +
                "    \"lastName\": \"Brock\",\n" +
                "    \"email\": \"isaac.brock@example.com\",\n" +
                "    \"login\": \"isaac.brock@example.com\",\n" +
                "    \"mobilePhone\": \"555-415-1337\"\n" +
                "  }\n" +
                "}";
        ResponseEntity<String> response = this.httpService.doRequest(url, HttpMethod.GET, "");
        System.out.print(response.toString());
        return  response.getBody().toString();
    }

    @Override
    public String getUserById() {
        return null;
    }

    @Override
    public String getUserByLoginId() {
        return null;
    }

    @Override
    public String getUserByLoginShortName() {
        return null;
    }
}
