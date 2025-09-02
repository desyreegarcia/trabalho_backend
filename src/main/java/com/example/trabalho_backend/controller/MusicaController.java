package com.example.trabalho_backend.controller;

import com.example.trabalho_backend.model.Musica;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("musicas")
public class MusicaController {
    @PostMapping
    public void salvar(@RequestBody Musica musicas){
        System.out.println("Musica" + musicas);

    }
}
