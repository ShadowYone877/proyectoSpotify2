package UI;

import java.util.Scanner;

public class UserMenu {
    private Scanner scanner;

    public UserMenu() {
        scanner = new Scanner(System.in);
    }

    public void mostrar() {
        System.out.println("\n=== Iniciar Sesión ===");
        System.out.print("Ingrese su correo: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        // Aquí conectarías con el sistema de autenticación
        if (email.equals("demo@correo.com") && contraseña.equals("1234")) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Credenciales inválidas. Intente de nuevo.");
        }
    }
}

