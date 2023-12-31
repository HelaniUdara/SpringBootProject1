package com.helani.SpringBootProject1.service;

import com.helani.SpringBootProject1.dto.userDTO;
import com.helani.SpringBootProject1.entity.user;
import com.helani.SpringBootProject1.repository.userRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class userService {

    @Autowired
    private userRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public userDTO saveUser(userDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, user.class));
        return userDTO;
    }

    public List<userDTO> getAllUsers(){
        List<user>userslist = userRepository.findAll();
        return modelMapper.map(userslist,new TypeToken<List<userDTO>>(){}.getType());
    }

    public userDTO updateUser(userDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, user.class));
        return userDTO;
    }

    public boolean deleteUser(userDTO userDTO){
        userRepository.delete(modelMapper.map(userDTO, user.class));
        return true;
    }

    public userDTO getUserByUserId(String id){
        user user = userRepository.getUserByUserId(id);
        return modelMapper.map(user, userDTO.class);
    }

    public userDTO getUserByUserIdAndAddress(String id, String address){
        user user = userRepository.getUserByUserIdAndAddress(id, address);
        return modelMapper.map(user, userDTO.class);
    }
}
