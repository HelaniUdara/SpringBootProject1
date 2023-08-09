package com.helani.SpringBootProject1.controller;

import com.helani.SpringBootProject1.dto.userDTO;
import com.helani.SpringBootProject1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("/getUsers")
    public List<userDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public userDTO saveUser(@RequestBody userDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public userDTO updateUser(@RequestBody userDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody userDTO userDTO){
        return userService.deleteUser(userDTO);
    }
}
