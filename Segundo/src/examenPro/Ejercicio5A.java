package examenPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio5A {
	
	static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Poblar la lista con nombres y notas de varios alumnos");
            System.out.println("2. Añadir un alumno");
            System.out.println("3. Mostrar nombres y notas de todos los alumnos");
            System.out.println("4. Ordenar la lista en orden alfabético");
            System.out.println("5. Ordenar la lista por notas");
            System.out.println("6. Eliminar un alumno por nombre");
            System.out.println("7. Mostrar la lista de alumnos");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    poblarLista();
                    break;
                case 2:
                    agregarAlumno(scanner);
                    break;
                case 3:
                    mostrarAlumnos();
                    break;
                case 4:
                    ordenarPorNombre();
                    break;
                case 5:
                    ordenarPorNotas();
                    break;
                case 6:
                    eliminarAlumno(scanner);
                    break;
                case 7:
                    mostrarLista();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);
    }

    public static void poblarLista() {
        listaAlumnos.add(new Alumno("Juan", 8));
        listaAlumnos.add(new Alumno("María", 9.2));
        listaAlumnos.add(new Alumno("Pedro", 7.8));
        listaAlumnos.add(new Alumno("Laura", 8.8));
        listaAlumnos.add(new Alumno("Carlos", 9.5));
        System.out.println("Lista poblada con éxito.");
    }

    public static void agregarAlumno(Scanner scanner) {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la nota del alumno: ");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        listaAlumnos.add(new Alumno(nombre, nota));
        System.out.println("Alumno añadido correctamente.");
    }

    public static void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre() + " - Nota: " + alumno.getNota());
        }
    }

    public static void ordenarPorNombre() {
        Collections.sort(listaAlumnos, Comparator.comparing(Alumno::getNombre));
        System.out.println("Lista ordenada por nombre.");
    }

    public static void ordenarPorNotas() {
        Collections.sort(listaAlumnos, Comparator.comparing(Alumno::getNota).reversed());
        System.out.println("Lista ordenada por notas.");
    }

    public static void eliminarAlumno(Scanner scanner) {
        System.out.print("Introduce el nombre del alumno a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                listaAlumnos.remove(i);
                System.out.println("Alumno eliminado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ningún alumno con ese nombre.");
    }

    public static void mostrarLista() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
        } else {
            for (int i = 0; i < listaAlumnos.size(); i++) {
                Alumno alumno = listaAlumnos.get(i);
                System.out.println((i + 1) + ". " + alumno.getNombre() + " - Nota: " + alumno.getNota());
            }
        }
    }

}
