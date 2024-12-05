package UI;
import Service.Animated;
import java.util.Scanner;
public class MainMenu {
    private Scanner opc;

    public MainMenu() {
        opc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Explorar Contenido");
            System.out.println("3. Mi Biblioteca");
            System.out.println("4. Cerrar");
            System.out.print("Seleccione una opción: ");
            opcion = opc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuLogin();
                    break;
                case 2:
                    Animated.mostrarAnimaciónCargando();
                    mostrarMenuExplorar();
                    break;
                case 3:
                    Animated.mostrarAnimaciónCargando();
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

    private void mostrarMenuLogin() {
        UserMenu loginUI = new UserMenu();
        loginUI.mostrar();
    }

    private void mostrarMenuExplorar() {
        ExploreMenu explorarUI = new ExploreMenu();
        explorarUI.mostrar();
    }

    private void mostrarMiBiblioteca() {
        System.out.println("\n=== Mi Biblioteca ===");
        System.out.println("Función en desarrollo...");
    }
}

