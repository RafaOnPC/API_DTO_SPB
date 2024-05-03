package com.patrondto.footballers.service;

import com.patrondto.footballers.dto.FootballerDTO;
import com.patrondto.footballers.model.Footballer;

import java.util.List;

public interface FootballerService {

    public FootballerDTO save(FootballerDTO footballerDTO);

    public List<FootballerDTO> getFootballers();

    public FootballerDTO getFootballer(Integer footballerId);

    public FootballerDTO updateFootballer(Integer footballerId, FootballerDTO footballerDTO);

    public FootballerDTO deleteFootballer(Integer footballerId);
}
