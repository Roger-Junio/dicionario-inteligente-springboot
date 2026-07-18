
package com.example.dicionario_com_spring.service;

import org.springframework.stereotype.Service;

import com.example.dicionario_com_spring.model.Palavras;
import com.example.dicionario_com_spring.repository.PalavrasRepository;

@Service
public class PalavrasService {

    // Variável da classe que guardará o objeto Repository
    private final PalavrasRepository palavrasRepository;

    // O Spring chama este construtor e entrega o objeto Repository
    public PalavrasService(PalavrasRepository palavrasRepository) {
        this.palavrasRepository = palavrasRepository;
    }

    public Palavras buscar(String palavra) {

        // O Service pede ao Repository para procurar a palavra no banco
        return palavrasRepository.findByPalavra(palavra)
                                 .orElse(null);
    }
}

