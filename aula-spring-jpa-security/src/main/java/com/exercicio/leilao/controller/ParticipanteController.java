package com.exercicio.leilao.controller;

import java.util.List;

import com.exercicio.leilao.domain.Participante;
import com.exercicio.leilao.service.ParticipanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("participante") //
public class ParticipanteController {
    
    @Autowired
    ParticipanteService service;

    //confirgurar endPoint

    @GetMapping //obter informação
    ResponseEntity<List<Participante>> participantes(){
        return ResponseEntity.status(HttpStatus.OK).body(service.readAll());
    }

    @PostMapping //criar informação
    ResponseEntity <Participante> novo(@RequestBody Participante participante){         // RequestBody informação vem do corpo da pg
        return ResponseEntity.status(HttpStatus.OK).body(service.create(participante));
    }

    

}
