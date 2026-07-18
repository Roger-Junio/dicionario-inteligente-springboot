
package com.example.dicionario_com_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dicionario_com_spring.model.Palavras;

import com.example.dicionario_com_spring.service.PalavrasService;

@RestController
@RequestMapping("/api")
public class BuscaController {

    // Variável da classe que guardará o objeto PalavrasService
    private final PalavrasService palavrasService;

    // O Spring chama este construtor e entrega o objeto PalavrasService
    public BuscaController(PalavrasService palavrasService) {
        this.palavrasService = palavrasService;
    }

    @GetMapping("/pesquisar")
    public Palavras pesquisar(@RequestParam String palavra) {

        // O Controller não pesquisa no banco.
        // Ele apenas pede ao Service para pesquisar.
        return palavrasService.buscar(palavra);
    }
}

