package com.okta.user.service;


public interface UserApiService {

    public void createUserWithoutCredentials(String payload, String queryString);

    public void createUserWithRecoveryQuestion(String payload, String queryString);

    public void createUserWithPassword(String payload, String queryString);

    public void createUserWithHashedPassword(String payload, String queryString);

    public void createUserWithPasswordAndRecoveryQuestion(String payload, String queryString);

    public void createUserWithAuthenticationProvider(String payload, String queryString);

    public void createUserInGroup(String payload, String queryString);

    public String getCurrentUser();

    public String getUserById();

    public String getUserByLoginId();

    public String getUserByLoginShortName();

}
