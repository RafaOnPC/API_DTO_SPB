package com.patrondto.footballers.service;

import com.patrondto.footballers.dto.FootballerDTO;
import com.patrondto.footballers.mapper.FootballerMapper;
import com.patrondto.footballers.model.Footballer;
import com.patrondto.footballers.repository.FootballerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballerServiceImple implements FootballerService {


    @Autowired
    private FootballerRepository footballerRepository;

    @Autowired
    private FootballerMapper footballerMapper;

    @Override
    public FootballerDTO save(FootballerDTO footballerDTO) {
        Footballer footballer = footballerMapper.toFootballer(footballerDTO);
        return footballerMapper.toFootballerDTO(footballerRepository.save(footballer));
    }

    @Override
    public List<FootballerDTO> getFootballers() {
        return footballerMapper.toFootballersDTO(footballerRepository.findAll());
    }

    @Override
    public FootballerDTO getFootballer(Integer footballerId) {
        Footballer footballer = footballerRepository.findById(footballerId).get();
        return footballerMapper.toFootballerDTO(footballer);
    }

    @Override
    public FootballerDTO updateFootballer(Integer footballerId, FootballerDTO footballerDTO) {
        Footballer footballer = footballerRepository.findById(footballerId).get();
        footballerMapper.updateFootballer(footballer, footballerDTO);
        return footballerMapper.toFootballerDTO(footballerRepository.save(footballer));
    }

    @Override
    public FootballerDTO deleteFootballer(Integer footballerId) {
        Footballer footballer = footballerRepository.findById(footballerId).get();
        FootballerDTO footballerDTO = footballerMapper.toFootballerDTO(footballer);
        footballerRepository.deleteById(footballerId);
        return footballerDTO;
    }
}
