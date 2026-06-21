package com.example.dicionario_com_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BuscaController {

    
    @GetMapping("/pesquisar")
    public String pesquisar() {

        return "api dicionario respondeu OK OK OK";

    }


   
}