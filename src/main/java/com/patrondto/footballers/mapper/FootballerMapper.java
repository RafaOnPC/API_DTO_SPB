package com.patrondto.footballers.mapper;

import com.patrondto.footballers.dto.FootballerDTO;
import com.patrondto.footballers.model.Footballer;

import java.util.List;

public interface FootballerMapper {

    //Usado para pasar los valores del DTO a la clase entidad
    Footballer toFootballer(FootballerDTO footballerDTO);

    //Usado para pasar los valores de la clase entidad al DTO para poder actualizar sus datos
    FootballerDTO toFootballerDTO(Footballer footballer);

    //Usado para pasar los valores del DTO a la clase entidad
    List<FootballerDTO> toFootballersDTO(List<Footballer> footballers);

    //Actualizar datos del registro
    void updateFootballer(Footballer footballer, FootballerDTO footballerDTO);

}
