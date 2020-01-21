package com.ndmitrenko.springwithoutspringboot.dto;

import com.ndmitrenko.springwithoutspringboot.model.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UserDto {
    private String userName;
    private Integer age;
    private List<EstateDto> estate;

    public static UserDto toDto(User user){
        return UserDto.builder()
                .age(user.getAge())
                .userName(user.getUserName())
                .estate(EstateDto.toDto(user.getEstate()))
                .build();
    }

    public static List<UserDto> toDto(List<User> users){
        return users.stream().map(UserDto::toDto).collect(Collectors.toList());
    }
}
