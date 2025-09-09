package com.example.trabalho_backend.controller;

import com.example.trabalho_backend.model.Musica;
import com.example.trabalho_backend.repositorio.MusicaRepositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("musicas")
public class MusicaController {
    private MusicaRepositorio musicaRepositorio;
    public MusicaController(MusicaRepositorio musicaRepositorio) {
        this.musicaRepositorio = musicaRepositorio;
    }
    @PostMapping
    public void salvar(@RequestBody Musica musicas){
        String id = UUID.randomUUID().toString();
        musicas.setId(id);
        musicaRepositorio.save(musicas);
        System.out.println("Musica" + musicas);
    }
}
