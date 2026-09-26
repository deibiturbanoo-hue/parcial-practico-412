package com.biblioteca;

import java.util.Scanner;

/**
 * Clase principal.
 * Aquí creamos los 4 objetos que pide el taller y probamos
 * los métodos de préstamo y devolución.
 */
public class Main {

    public static void main(String[] args) {

        // 1) libro1: usando el constructor con parámetros.
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // 2) libro2: usando el constructor por defecto y pidiendo los datos por consola.
        Libro libro2 = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Datos para libro2 (constructor por defecto) ===");
        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.print("Número de ejemplares: ");
        libro2.setNumeroEjemplares(Integer.parseInt(sc.nextLine()));
        System.out.print("Número de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(Integer.parseInt(sc.nextLine()));

        // 3) libroTextoUNIAC: con todos sus atributos.
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación", "Luis Joyanes Aguilar",
                4, 1, "Programación II", "Facultad de Ingeniería"
        );

        // 4) novela: indicando su tipo.
        Novela novela = new Novela("El nombre del viento", "Patrick Rothfuss", 3, 0, "aventuras");

        System.out.println();
        System.out.println("=== Objetos creados ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUNIAC);
        System.out.println(novela);

        // ---------- Pruebas de préstamo y devolución ----------
        System.out.println();
        System.out.println("=== Probando préstamo y devolución ===");

        System.out.println("Prestar libro1: " + libro1.prestamo());
        System.out.println("Estado libro1 -> " + libro1);

        System.out.println("Devolver libro1: " + libro1.devolucion());
        System.out.println("Estado libro1 -> " + libro1);

        System.out.println("Prestar novela: " + novela.prestamo());
        System.out.println("Estado novela -> " + novela);

        // Intentamos devolver un libro que no tiene ejemplares prestados.
        System.out.println("Intentar devolver libroTextoUNIAC sin préstamos previos: "
                + libroTextoUNIAC.devolucion());

        // Prestamos todos los ejemplares de libroTextoUNIAC hasta que no se pueda más.
        System.out.println();
        System.out.println("=== Prestando libroTextoUNIAC hasta agotar ejemplares ===");
        boolean resultado = true;
        while (resultado) {
            resultado = libroTextoUNIAC.prestamo();
            System.out.println("Préstamo: " + resultado + " -> " + libroTextoUNIAC);
        }

        sc.close();
    }
}
