package com.seduc2.pr.controller;

import com.seduc2.pr.entity.Animal;
import com.seduc2.pr.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/animais")
public class AnimalController {


    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> mostrarAnimais(){
        return service.mostrarAnimais();
    }



}