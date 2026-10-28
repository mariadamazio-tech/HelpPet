package com.seduc2.pr.entity;

import java.time.LocalDate;

public class Animal {

    public Animal(long id, String nome, String especie, String sexo, String localDate, double peso, String cor, boolean castrado, String vacinacao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        LocalDate = localDate;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    public Animal(){

    }

    public Animal( String nome, String especie, String sexo, String localDate, double peso, String cor, boolean castrado, String vacinacao, String observacoes) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        LocalDate = localDate;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
    }

    private long id;
    private String nome;
    private String especie;
    private String sexo;
    private String LocalDate;
    private double peso;
    private String cor;
    private boolean castrado;
    private String vacinacao;
    private String observacoes;
    private String raca;
    private LocalDate dataNascimento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(String localDate) {
        LocalDate = localDate;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Animal(String raca, LocalDate datanascimento) {
        this.raca = raca;
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
