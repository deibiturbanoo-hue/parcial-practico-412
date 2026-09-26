package com.biblioteca;

/**
 * Clase Libro.
 * Aquí guardamos la información básica que tiene cualquier libro
 * de la biblioteca: título, autor, cuántos ejemplares hay y
 * cuántos están prestados en este momento.
 *
 * Los atributos son "protected" (no "private") porque las clases
 * hijas (LibroTexto, LibroTextoUNIAC, Novela) también necesitan
 * usarlos directamente cuando arman su propio toString().
 */
public class Libro {

    protected String titulo;
    protected String autor;
    protected int numeroEjemplares;
    protected int numeroEjemplaresPrestados;

    // Constructor vacío: crea un libro "por defecto" cuando todavía
    // no sabemos los datos reales.
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Sin autor";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    // Constructor con todos los datos del libro.
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // ---------- Getters y Setters (encapsulamiento) ----------

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

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // ---------- Comportamiento del libro ----------

    /**
     * Presta un ejemplar del libro.
     * Solo se puede prestar si todavía quedan ejemplares disponibles
     * (es decir, no todos están ya prestados).
     */
    public boolean prestamo() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Devuelve un ejemplar del libro.
     * Solo se puede devolver si hay al menos un ejemplar prestado.
     */
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo +
                ", autor=" + autor +
                ", ejemplares=" + numeroEjemplares +
                ", prestados=" + numeroEjemplaresPrestados +
                ", disponibles=" + (numeroEjemplares - numeroEjemplaresPrestados) + "]";
    }
}
