package com.biblioteca;

// Esta clase es para los libros de texto (los que se usan en una materia).
// La idea es que no tenga que repetir todo lo que ya tiene un libro normal
// (título, autor, ejemplares, etc.), sino que herede eso de la clase Libro
// y solo le agregue lo nuevo, que en este caso es el curso al que pertenece.
public class LibroTexto extends Libro {

    // Este es el único dato nuevo que necesita un libro de texto: el curso.
    protected String curso;

    // Constructor vacío, por si queremos crear el libro de texto sin
    // datos todavía y llenarlos después.
    public LibroTexto() {
        super(); // esto crea primero un Libro "vacío" por dentro
        this.curso = "Sin curso asignado";
    }

    // Constructor completo: recibe los datos normales de un libro más
    // el curso. Los 4 primeros datos se los pasamos al padre (Libro)
    // con super(...), porque esos ya los sabe manejar la clase Libro;
    // nosotros solo nos encargamos de guardar el curso.
    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                       int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.curso = curso;
    }

    // Getter y setter del curso. Los usamos en vez de dejar el atributo
    // público para mantener el encapsulamiento (que nadie de afuera
    // pueda cambiar el curso sin pasar por este método).
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobreescribimos el toString para que también muestre el curso.
    // No repetimos el texto del padre: llamamos a super.toString()
    // y solo le agregamos la parte nueva, así si el padre cambia,
    // este método no se rompe.
    @Override
    public String toString() {
        return "LibroTexto [" + super.toString() + ", curso=" + curso + "]";
    }
}