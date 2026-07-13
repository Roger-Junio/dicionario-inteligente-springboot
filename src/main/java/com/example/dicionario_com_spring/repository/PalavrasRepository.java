package com.example.dicionario_com_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dicionario_com_spring.model.Palavras;

public interface PalavrasRepository extends JpaRepository<Palavras, Long> {

}