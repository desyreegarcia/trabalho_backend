package com.example.trabalho_backend.repositorio;

import com.example.trabalho_backend.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepositorio extends JpaRepository<Musica, String> {
}
