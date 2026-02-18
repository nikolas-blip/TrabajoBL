package org.example.controller;

import org.example.model.Libro;
import org.example.service.LibroService;
import org.example.view.LibroView;

public class LibroController {

    private LibroService service;
    private LibroView view;

    public LibroController(LibroService service, LibroView view) {
        this.service = service;
        this.view = view;
    }

    public void registrarLibro(Long id, String titulo, String autor) {
        Libro libro = service.registrarLibro(id, titulo, autor);
        if (libro != null) {
            view.mostrarMensaje("Libro registrado: " + libro.getTitulo());
        }
    }

    public void listarLibros() {
        view.mostrarLibros(service.obtenerTodosLosLibros());
    }

    public void prestarLibro(Long id) {
        service.prestarLibro(id);
    }

    public void devolverLibro(Long id) {
        service.devolverLibro(id);
    }

    public void buscarLibro(Long id) {
        Libro libro = service.buscarLibro(id);
        if (libro != null) {
            view.mostrarLibro(libro);
        } else {
            System.out.println("No se encontró libro con ID " + id);
        }
    }
}