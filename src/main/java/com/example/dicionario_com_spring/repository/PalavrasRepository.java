package com.example.dicionario_com_spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dicionario_com_spring.model.Palavras;


//aqui converso com o banco de dados para colher a informação necessario da funcionalidade que o service mandou

@Repository
public interface PalavrasRepository extends JpaRepository<Palavras, Long> {

Optional<Palavras> findByPalavra(String palavra);
   
}
