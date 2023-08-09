package com.helani.SpringBootProject1.controller;

import com.helani.SpringBootProject1.dto.userDTO;
import com.helani.SpringBootProject1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Helooo!";
    }

    @PostMapping("/saveUser")
    public userDTO saveUser(@RequestBody userDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
