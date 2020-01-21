package com.ndmitrenko.springwithoutspringboot.service;


import com.ndmitrenko.springwithoutspringboot.dto.UserDto;
import com.ndmitrenko.springwithoutspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return UserDto.toDto(userRepository.findAll());
    }

    public List<UserDto> getBySecondName(String secondName) {
        return UserDto.toDto(userRepository.findAllBySecondName(secondName));
    }

}
