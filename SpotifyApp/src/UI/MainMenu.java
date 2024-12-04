package UI;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenú() {
        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Explorar Contenido");
            System.out.println("3. Mi Biblioteca");
            System.out.println("4. Cerrar");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenúLogin();
                    break;
                case 2:
                    mostrarMenúExplorar();
                    break;
                case 3:
                    mostrarMiBiblioteca();
                    break;
                case 4:
                    System.out.println("¡Gracias por usar la aplicación!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void mostrarMenúLogin() {
        UserMenu loginUI = new UserMenu();
        loginUI.mostrar();
    }

    private void mostrarMenúExplorar() {
        ExploreMenu explorarUI = new ExploreMenu();
        explorarUI.mostrar();
    }

    private void mostrarMiBiblioteca() {
        System.out.println("\n=== Mi Biblioteca ===");
        System.out.println("Función en desarrollo...");
    }
}

