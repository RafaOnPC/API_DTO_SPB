package com.patrondto.footballers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FootballerDTO {

    private int id;

    private String fullname;

    private LocalDate birthday;

    private String country;

    private String position;

    private String weight;

    private String height;

    private String dominantFoot;

    private String number;

    private String club;
}
