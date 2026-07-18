package com.example.dicionario_com_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Palavras {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String palavra;
    private String significado;
    
    public void setPalavra(String palavra) {this.palavra = palavra; }
    public String getPalavra() { return palavra; }

    public void setSignificado(String significado) {this.significado = significado; }
    public String getSignificado() { return significado; }

    



}
