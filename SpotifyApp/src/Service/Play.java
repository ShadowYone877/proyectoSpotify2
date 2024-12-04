package Service;

public class Play {
    private Contenido contenidoActual;
    private int tiempoActual;

    public void reproducir(Contenido contenido) {
        this.contenidoActual = contenido;
        this.tiempoActual = 0;
        contenido.reproducir();
        System.out.println("Reproducción iniciada: " + contenido.getTitulo());
    }

    public void pausar() {
        if (contenidoActual != null) {
            System.out.println("Reproducción pausada en: " + tiempoActual + " segundos.");
        } else {
            System.out.println("No hay contenido reproduciéndose.");
        }
    }

    public void adelantar(int segundos) {
        if (contenidoActual != null) {
            tiempoActual += segundos;
            System.out.println("Adelantado a: " + tiempoActual + " segundos.");
        } else {
            System.out.println("No hay contenido reproduciéndose.");
        }
    }

    // Getters y Setters
}
