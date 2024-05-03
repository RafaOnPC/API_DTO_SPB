package com.patrondto.footballers.mapper;

import com.patrondto.footballers.dto.FootballerDTO;
import com.patrondto.footballers.model.Footballer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FootballerMapperImple implements FootballerMapper{


    @Override
    public Footballer toFootballer(FootballerDTO footballerDTO) {
        if(footballerDTO == null){
            return null;
        }

        Footballer footballer = new Footballer();
        footballer.setId(footballerDTO.getId());
        footballer.setFullname(footballerDTO.getFullname());
        footballer.setBirthday(footballerDTO.getBirthday());
        footballer.setCountry(footballerDTO.getCountry());
        footballer.setPosition(footballerDTO.getPosition());
        footballer.setWeight(footballerDTO.getWeight());
        footballer.setHeight(footballerDTO.getHeight());
        footballer.setDominantFoot(footballerDTO.getDominantFoot());
        footballer.setNumber(footballerDTO.getNumber());
        footballer.setClub(footballerDTO.getClub());

        return footballer;

    }

    @Override
    public FootballerDTO toFootballerDTO(Footballer footballer) {
        if(footballer == null){
            return null;
        }

        FootballerDTO footballerDTO = new FootballerDTO();
        footballerDTO.setId(footballer.getId());
        footballerDTO.setFullname(footballer.getFullname());
        footballerDTO.setBirthday(footballer.getBirthday());
        footballerDTO.setCountry(footballer.getCountry());
        footballerDTO.setPosition(footballer.getPosition());
        footballerDTO.setWeight(footballer.getWeight());
        footballerDTO.setHeight(footballer.getHeight());
        footballerDTO.setDominantFoot(footballer.getDominantFoot());
        footballerDTO.setNumber(footballer.getNumber());
        footballerDTO.setClub(footballer.getClub());

        return footballerDTO;
    }

    @Override
    public List<FootballerDTO> toFootballersDTO(List<Footballer> footballers) {
        if(footballers == null){
            return null;
        }

        List<FootballerDTO> list = new ArrayList<FootballerDTO>(footballers.size());
        for (Footballer baller : footballers){
                list.add(toFootballerDTO(baller));
        }

        return list;
    }

    @Override
    public void updateFootballer(Footballer footballer, FootballerDTO footballerDTO) {
        if(footballerDTO == null){
            return;
        }

        footballer.setId(footballerDTO.getId());
        footballer.setFullname(footballerDTO.getFullname());
        footballer.setBirthday(footballerDTO.getBirthday());
        footballer.setCountry(footballerDTO.getCountry());
        footballer.setPosition(footballerDTO.getPosition());
        footballer.setWeight(footballerDTO.getWeight());
        footballer.setHeight(footballerDTO.getHeight());
        footballer.setDominantFoot(footballerDTO.getDominantFoot());
        footballer.setNumber(footballerDTO.getNumber());
        footballer.setClub(footballerDTO.getClub());
    }
}
