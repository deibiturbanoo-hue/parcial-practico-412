package com.biblioteca;

/**
 * LibroTextoUNIAC hereda de LibroTexto (segundo nivel de herencia).
 * Esto es una herencia de dos niveles: Libro -> LibroTexto -> LibroTextoUNIAC.
 * Gracias a esta cadena, LibroTextoUNIAC ya tiene disponibles todos
 * los atributos y métodos de Libro (título, autor, etc.) y también
 * los de LibroTexto (curso), sin necesidad de volver a escribirlos.
 *
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
        setFacultad(facultad); // usamos el setter para aplicar la validación
    }

    public String getFacultad() {
        return facultad;
    }

    /**
     * Validación simple: si la facultad viene vacía o nula,
     * la marcamos como "Sin facultad asignada" en vez de dejarla en blanco.
     */
    public void setFacultad(String facultad) {
        if (facultad == null || facultad.trim().isEmpty()) {
            this.facultad = "Sin facultad asignada";
        } else {
            this.facultad = facultad;
        }
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAC [" + super.toString() + ", facultad=" + facultad + "]";
    }
}