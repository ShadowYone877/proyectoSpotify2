package Service;

public class Animated {
    public static void mostrarAnimaciónCargando() {
        System.out.print("Cargando");
        for (int i = 0; i < 5; i++) {
            try {
                // Agrega un punto con un pequeño retraso
                System.out.print(".");
                Thread.sleep(300); // Espera de 300 ms
            } catch (InterruptedException e) {
                System.out.println("Se interrumpió la animación.");
            }
        }
        // Añade la nota musical al final
        System.out.println("🎵");
    }
}

