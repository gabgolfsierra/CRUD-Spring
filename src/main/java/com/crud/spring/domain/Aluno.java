package com.crud.spring.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String sobrenome;
    private String matricula;



}
