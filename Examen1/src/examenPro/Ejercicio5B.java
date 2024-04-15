package examenPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio5B {
	
	static ArrayList<Persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Poblar la lista con información de varias personas");
            System.out.println("2. Añadir una persona");
            System.out.println("3. Mostrar la información de todas las personas");
            System.out.println("4. Ordenar la lista por apellido en orden alfabético");
            System.out.println("5. Ordenar la lista por edad");
            System.out.println("6. Eliminar una persona por DNI");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    poblarLista();
                    break;
                case 2:
                    agregarPersona(scanner);
                    break;
                case 3:
                    mostrarPersonas();
                    break;
                case 4:
                    ordenarPorApellido();
                    break;
                case 5:
                    ordenarPorEdad();
                    break;
                case 6:
                    eliminarPersona(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 7);
    }

    public static void poblarLista() {
        listaPersonas.add(new Persona("Juan", "Pérez", "12345678A", 30));
        listaPersonas.add(new Persona("María", "García", "87654321B", 25));
        listaPersonas.add(new Persona("Pedro", "López", "56781234C", 35));
        listaPersonas.add(new Persona("Laura", "Martínez", "43218765D", 28));
        listaPersonas.add(new Persona("Carlos", "Sánchez", "87654321E", 40));
        System.out.println("Lista poblada con éxito.");
    }

    public static void agregarPersona(Scanner scanner) {
        System.out.print("Introduce el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el apellido de la persona: ");
        String apellido = scanner.nextLine();
        System.out.print("Introduce el DNI de la persona: ");
        String dni = scanner.nextLine();
        System.out.print("Introduce la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        listaPersonas.add(new Persona(nombre, apellido, dni, edad));
        System.out.println("Persona añadida correctamente.");
    }

    public static void mostrarPersonas() {
        for (Persona persona : listaPersonas) {
            System.out.println(persona.toString());
        }
    }

    public static void ordenarPorApellido() {
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
        System.out.println("Lista ordenada por apellido.");
    }

    public static void ordenarPorEdad() {
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getEdad));
        System.out.println("Lista ordenada por edad.");
    }

    public static void eliminarPersona(Scanner scanner) {
        System.out.print("Introduce el DNI de la persona a eliminar: ");
        String dniEliminar = scanner.nextLine();

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getDni().equalsIgnoreCase(dniEliminar)) {
                listaPersonas.remove(i);
                System.out.println("Persona eliminada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ninguna persona con ese DNI.");
    }

}
