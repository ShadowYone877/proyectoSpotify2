package UI;

import java.util.Scanner;

public class ExploreMenu {
    private Scanner scanner;

    public ExploreMenu() {
        scanner = new Scanner(System.in);
    }

    public void mostrar() {
        int opcion;
        do {
            System.out.println("\n=== Explorar Contenido ===");
            System.out.println("1. Ver Novedades");
            System.out.println("2. Canciones del Momento");
            System.out.println("3. Buscar Género");
            System.out.println("4. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarNovedades();
                    break;
                case 2:
                    mostrarCancionesDelMomento();
                    break;
                case 3:
                    buscarGénero();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void mostrarNovedades() {
        System.out.println("\n=== Novedades ===");
        System.out.println("Función en desarrollo...");
    }

    private void mostrarCancionesDelMomento() {
        System.out.println("\n=== Canciones del Momento ===");
        System.out.println("Función en desarrollo...");
    }

    private void buscarGénero() {
        System.out.println("\n=== Buscar Género ===");
        System.out.print("Ingrese el nombre del género: ");
        String genero = scanner.next();
        System.out.println("Buscando género: " + genero + "...");
    }
}

