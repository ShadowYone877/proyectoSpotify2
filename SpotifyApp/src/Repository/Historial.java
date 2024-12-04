package Repository;

import Service.Contenido;
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Contenido> contenidosReproducidos;

    public Historial() {
        this.contenidosReproducidos = new ArrayList<>();
    }

    public void agregarContenido(Contenido contenido) {
        contenidosReproducidos.add(contenido);
        System.out.println("Añadido al historial: " + contenido.getTitulo());
    }

    public List<Contenido> obtenerHistorial() {
        return contenidosReproducidos;
    }

    // Método para imprimir el historial
    public void mostrarHistorial() {
        System.out.println("Historial de reproducción:");
        for (Contenido contenido : contenidosReproducidos) {
            System.out.println("- " + contenido.getTitulo());
        }
    }

    public List<Contenido> getContenidosReproducidos() {
        return contenidosReproducidos;
    }

    public void setContenidosReproducidos(List<Contenido> contenidosReproducidos) {
        this.contenidosReproducidos = contenidosReproducidos;
    }
    
}
