
package com.example.restapi.number;

import com.example.restapi.GenerateService;
import com.example.restapi.user.UserGateway;
import com.example.restapi.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class idController {

    @Autowired
    private GenerateService Service;

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/id")
    public  ResponseModel generateId(){
        String response = Service.getId();
        return new ResponseModel(response);
    }

    @GetMapping("/user")
    public UserResponse getUser() {
        UserResponse user = userGateway.getUserById(1);
        return user;
    }
}
