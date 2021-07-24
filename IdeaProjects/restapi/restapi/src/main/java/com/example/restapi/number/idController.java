package com.example.restapi.number;

import com.example.restapi.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class idController {

    @Autowired
    private GenerateService Service;

    @GetMapping("/id")
    public  ResponseModel generateId(){
        String response = Service.getId();
        return new ResponseModel(response);
    }
}
