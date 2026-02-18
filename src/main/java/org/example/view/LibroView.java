package org.example.view;

import org.example.model.Libro;
import java.util.List;

public class LibroView {

    public void mostrarLibros(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados");
            return;
        }

        System.out.println("== LISTA DE LIBROS ==");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("Total: " + libros.size() + " libros");
    }

    public void mostrarLibro(Libro libro) {
        System.out.println("== DATOS DEL LIBRO ==");
        System.out.println(libro);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}