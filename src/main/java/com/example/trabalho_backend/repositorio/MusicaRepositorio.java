package com.example.trabalho_backend.repositorio;

import com.example.trabalho_backend.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicaRepositorio extends JpaRepository<Musica, String> {
    List<Musica> findByNome(String nome);

}
