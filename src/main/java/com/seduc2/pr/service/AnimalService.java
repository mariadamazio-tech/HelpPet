package com.seduc2.pr.service;

import com.seduc2.pr.entity.Animal;
import com.seduc2.pr.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> mostrarAnimais(){
        List<Animal> animaisList = new ArrayList<>();
        return animaisList = repository.findAll();
    }
    public void cadastrarAnimal(Animal animation){
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.isCastrado());
        animal.setEspecie(animation.getEspecie());
        animal.setRaca(animation.getRaca());
        animal.setSexo(animation.getSexo());
        animal.setDataNascimento(animation.getDataNascimento());
        animal.setVacinacao(animation.getVacinacao());
        animal.setObservacoes(animal.getObservacoes());
        repository.save(animal);

    }

}
