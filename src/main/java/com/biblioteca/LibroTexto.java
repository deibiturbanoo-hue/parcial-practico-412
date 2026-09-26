package com.biblioteca;

/**
 * LibroTexto hereda de Libro.
 * Además de los datos normales de un libro, un libro de texto
 * está asociado a un curso específico (ej: "Cálculo I").
 */
public class LibroTexto extends Libro {

    protected String curso;

    public LibroTexto() {
        super(); // usa el constructor vacío de Libro
        this.curso = "Sin curso asignado";
    }

    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                       int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        // Reutilizamos el toString del padre y le agregamos el curso.
        return "LibroTexto [" + super.toString() + ", curso=" + curso + "]";
    }
}
