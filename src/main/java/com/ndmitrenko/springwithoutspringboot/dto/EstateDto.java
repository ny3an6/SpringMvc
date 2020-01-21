package com.ndmitrenko.springwithoutspringboot.dto;

import com.ndmitrenko.springwithoutspringboot.model.Estate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EstateDto {
    private String car;
    private String house;

    public static EstateDto toDto(Estate estate){
        return EstateDto.builder()
                .car(estate.getCar())
                .house(estate.getHouse())
                .build();
    }

    public static List<EstateDto> toDto(List<Estate> estates){
        return estates.stream().map(EstateDto::toDto).collect(Collectors.toList());
    }

}
