package com.biblioteca;

/**
 * LibroTexto hereda de Libro (primer nivel de herencia).
 * Además de los datos normales de un libro, un libro de texto
 * está asociado a un curso específico (ej: "Cálculo I").
 *
 * Esta clase es la base para LibroTextoUNIAC, que la extiende
 * a su vez -> por eso decimos que hay herencia de dos niveles:
 * Libro -> LibroTexto -> LibroTextoUNIAC.
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
        setCurso(curso); // usamos el setter para aplicar la validación
    }

    public String getCurso() {
        return curso;
    }

    /**
     * Validación simple: si el curso viene vacío o nulo,
     * no lo dejamos así, sino que lo marcamos como "Sin curso asignado".
     */
    public void setCurso(String curso) {
        if (curso == null || curso.trim().isEmpty()) {
            this.curso = "Sin curso asignado";
        } else {
            this.curso = curso;
        }
    }

    @Override
    public String toString() {
        // Reutilizamos el toString del padre y le agregamos el curso.
        return "LibroTexto [" + super.toString() + ", curso=" + curso + "]";
    }
}