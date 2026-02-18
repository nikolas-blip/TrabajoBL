package org.example;

import org.example.controller.LibroController;
import org.example.model.Libro;
import org.example.service.LibroService;
import org.example.service.LibroServiceImpl;
import org.example.view.LibroView;

public class Main {
    public static void main(String[] args) {


        LibroService service = new LibroServiceImpl();
        LibroView view = new LibroView();
        LibroController controller = new LibroController(service, view);

        // DONDE SE REGISTRAN LOS LIBROS ES ACAA---------------------
        System.out.println("\n--- REGISTRANDO LIBROS ---");
        controller.registrarLibro(1L, "Cien años de soledad", "Gabriel García Márquez");
        controller.registrarLibro(2L, "1984", "George Orwell");
        controller.registrarLibro(3L, "El principito", "Antoine de Saint-Exupéry");

        // ACA ES LA LISTA DE LIBROOOS-------------------------------
        System.out.println("\n--- LISTA DE LIBROS ---");
        controller.listarLibros();

        // ACA SE PRESTARON LIBROS-------------------
        System.out.println("\n--- PRESTANDO LIBROS ---");
        controller.prestarLibro(1L);
        controller.prestarLibro(2L);

        // ACA SE PRESTO UN LIBRO YA PRESTADO---------------
        System.out.println("\n--- INTENTANDO PRESTAR LIBRO YA PRESTADO ---");
        controller.prestarLibro(1L);

        // LA LISTA DESPUES DE PRESTAMO--------------------
        System.out.println("\n--- LIBROS DESPUÉS DE PRÉSTAMOS ---");
        controller.listarLibros();

        // SE DEVOLVIO EL LIBRO-----------------------
        System.out.println("\n--- DEVOLVIENDO LIBRO ---");
        controller.devolverLibro(1L);

        // LIBRO SE DEVOLVIO----------------------
        System.out.println("\n--- LIBROS DESPUÉS DE DEVOLUCIÓN ---");
        controller.listarLibros();
    }
}