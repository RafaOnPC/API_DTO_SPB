package com.patrondto.footballers.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "footballers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idFootballer", nullable = false)
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
