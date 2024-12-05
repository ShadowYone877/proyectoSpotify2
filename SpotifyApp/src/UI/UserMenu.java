package UI;

import Service.Animated;
import java.util.Scanner;
public class UserMenu {
    private Scanner opc;

    public UserMenu() {
        opc = new Scanner(System.in);
    }

    public void mostrar() {
        Animated.mostrarAnimaciónCargando();
        System.out.println("\n=== Iniciar Sesión ===");
        System.out.print("Ingrese su correo: ");
        String email = opc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = opc.nextLine();
        if (email.equals("demo@correo.com") && contraseña.equals("1234")) {
            Animated.mostrarAnimaciónCargando();
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Credenciales inválidas. Intente de nuevo.");
        }
    }
}

