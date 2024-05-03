package com.patrondto.footballers.controller;

import com.patrondto.footballers.dto.FootballerDTO;
import com.patrondto.footballers.service.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FootballerController {

    @Autowired
    private FootballerService footballerService;

    //Crear un nuevo registro de footballer
    @PostMapping("/footballers")
    public ResponseEntity<FootballerDTO> saveFootballer(@RequestBody FootballerDTO footballerDTO) {
        return new ResponseEntity<>(footballerService.save(footballerDTO), HttpStatus.CREATED);
    }

    //Obtener todos los registros de footballers almacenados
    @GetMapping("/footballers")
    public ResponseEntity<List<FootballerDTO>> getFootballers() {
        return new ResponseEntity<>(footballerService.getFootballers(), HttpStatus.OK);
    }

    //Obtener un registro de un footballer
    @GetMapping("/footballers/{footballerId}")
    public ResponseEntity<FootballerDTO> getFootballer(@PathVariable Integer footballerId) {
        return new ResponseEntity<>(footballerService.getFootballer(footballerId), HttpStatus.OK);
    }

    //Actualizar un registro de un footballer
    @PutMapping("/footballers/{footballerId}")
    public ResponseEntity<FootballerDTO> updateFootballer(@PathVariable Integer footballerId, @RequestBody FootballerDTO footballerDTO){
        return new ResponseEntity<>(footballerService.updateFootballer(footballerId, footballerDTO), HttpStatus.OK);
    }

    //Eliminacion de un registro de footballer
    @DeleteMapping("/footballers/{footballerId}")
    public ResponseEntity<FootballerDTO> deleteFootballer(@PathVariable Integer footballerId){
        return new ResponseEntity<>(footballerService.deleteFootballer(footballerId), HttpStatus.OK);
    }


}
