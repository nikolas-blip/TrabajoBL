package org.example.service;

import org.example.model.Libro;
import java.util.List;

public interface LibroService {
    Libro registrarLibro(Long id, String titulo, String autor);
    Libro buscarLibro(Long id);
    List<Libro> obtenerTodosLosLibros();
    void prestarLibro(Long id);
    void devolverLibro(Long id);
    boolean existeLibro(Long id);
}