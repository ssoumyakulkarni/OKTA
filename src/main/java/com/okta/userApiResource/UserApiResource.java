package com.okta.userApiResource;

import com.okta.user.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserApiResource {

    public UserApiService userApiService;
    @Autowired
    public UserApiResource(UserApiService userApiService){
        this.userApiService = userApiService;
    }

    @GetMapping()
    public @ResponseBody
    String getUserInfo(){
        return this.userApiService.getCurrentUser();
    }

}
