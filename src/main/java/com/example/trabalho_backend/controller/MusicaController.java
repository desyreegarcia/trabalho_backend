package com.example.trabalho_backend.controller;

import com.example.trabalho_backend.model.Musica;
import com.example.trabalho_backend.repositorio.MusicaRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("/{id}")
    public Musica obterPorId(@PathVariable("id") String id) {
        return musicaRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        musicaRepositorio.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Musica musicas){
        musicas.setId(id);
        musicaRepositorio.save(musicas);
    }

    @GetMapping
    public List<Musica> buscar(@RequestParam ("nome") String nome) {
        return musicaRepositorio.findByNome(nome);
    }
}
