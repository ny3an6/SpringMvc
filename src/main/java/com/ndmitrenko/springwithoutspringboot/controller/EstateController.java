package com.ndmitrenko.springwithoutspringboot.controller;

import com.ndmitrenko.springwithoutspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class EstateController {

    @Autowired
    private UserService userService;

    @DeleteMapping("/delete/{secondName}")
    public void deleteEstate(@PathVariable String secondName){
        return ResponseEntity.ok(userService.)
    }
}
