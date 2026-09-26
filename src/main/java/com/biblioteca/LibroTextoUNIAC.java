package com.biblioteca;

/**
 * LibroTextoUNIAC hereda de LibroTexto (que a su vez hereda de Libro).
 * Esto es una herencia de dos niveles: Libro -> LibroTexto -> LibroTextoUNIAC.
 * Este tipo de libro además indica qué facultad lo publicó.
 */
public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC() {
        super(); // usa el constructor vacío de LibroTexto
        this.facultad = "Sin facultad asignada";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares,
                            int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAC [" + super.toString() + ", facultad=" + facultad + "]";
    }
}
