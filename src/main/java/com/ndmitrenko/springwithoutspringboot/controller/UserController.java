package com.ndmitrenko.springwithoutspringboot.controller;


import com.ndmitrenko.springwithoutspringboot.dto.UserDto;
import com.ndmitrenko.springwithoutspringboot.model.User;
import com.ndmitrenko.springwithoutspringboot.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @RequestMapping(method = RequestMethod.GET, value = "getuser")
    @ResponseBody
    public List<UserDto> getUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBySec")
    @ResponseBody
    public List<UserDto> getBySecondName(){
        return userService.getAllUsers();
    }
}
