package org.example.model;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private EstadoLibro estado;

    public Libro(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE;
    }

    // GETTER AND SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    // Métodos útiles
    public boolean estaDisponible() {
        return estado == EstadoLibro.DISPONIBLE;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + titulo + " - " + autor + " [" + estado + "]";
    }
}