package org.example.service;

import org.example.model.Libro;
import org.example.model.EstadoLibro;
import java.util.ArrayList;
import java.util.List;

public class LibroServiceImpl implements LibroService {

    private List<Libro> libros = new ArrayList<>();

    @Override
    public Libro registrarLibro(Long id, String titulo, String autor) {
        // Verificar si ya existe un libro con ese ID
        if (existeLibro(id)) {
            System.out.println("Error: Ya existe un libro con ID " + id);
            return null;
        }

        Libro nuevoLibro = new Libro(id, titulo, autor);
        libros.add(nuevoLibro);
        return nuevoLibro;
    }

    @Override
    public Libro buscarLibro(Long id) {
        for (Libro libro : libros) {
            if (libro.getId().equals(id)) {
                return libro;
            }
        }
        return null; // No encontró el libro
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }

    @Override
    public void prestarLibro(Long id) {
        Libro libro = buscarLibro(id);

        if (libro == null) {
            System.out.println("Error: No existe libro con ID " + id);
            return;
        }

        if (libro.getEstado() == EstadoLibro.PRESTADO) {
            System.out.println("Error: El libro \"" + libro.getTitulo() + "\" ya está prestado");
            return;
        }

        libro.setEstado(EstadoLibro.PRESTADO);
        System.out.println("Libro \"" + libro.getTitulo() + "\" prestado ");
    }

    @Override
    public void devolverLibro(Long id) {
        Libro libro = buscarLibro(id);

        if (libro == null) {
            System.out.println("Error: No existe libro con ID " + id);
            return;
        }

        if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
            System.out.println("Error: El libro \"" + libro.getTitulo() + "\" ya está disponible");
            return;
        }

        libro.setEstado(EstadoLibro.DISPONIBLE);
        System.out.println("Libro \"" + libro.getTitulo() + "\" se de volvio ");
    }

    @Override
    public boolean existeLibro(Long id) {
        return buscarLibro(id) != null;
    }
}