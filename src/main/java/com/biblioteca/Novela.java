package com.biblioteca;

/**
 * Novela hereda de Libro.
 * Una novela puede ser de varios tipos: histórica, romántica,
 * policíaca, realista, ciencia ficción o aventuras.
 *
 * Nota: usamos String para el tipo (en vez de crear un enum aparte)
 * para que sea más simple de entender y de sustentar, pero validamos
 * que el valor ingresado sea uno de los permitidos.
 */
public class Novela extends Libro {

    private static final String[] TIPOS_VALIDOS = {
            "historica", "romantica", "policiaca", "realista", "ciencia ficcion", "aventuras"
    };

    private String tipo;

    public Novela() {
        super();
        this.tipo = "sin definir";
    }

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int numeroEjemplaresPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            this.tipo = "sin definir";
            return;
        }
        String normalizado = tipo.trim().toLowerCase();
        for (String valido : TIPOS_VALIDOS) {
            if (valido.equals(normalizado)) {
                this.tipo = tipo;
                return;
            }
        }
        // Si no coincide con ninguno de los tipos permitidos,
        // igual lo guardamos, pero avisamos por consola.
        System.out.println("Aviso: '" + tipo + "' no es un tipo de novela de la lista sugerida.");
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela [" + super.toString() + ", tipo=" + tipo + "]";
    }
}
