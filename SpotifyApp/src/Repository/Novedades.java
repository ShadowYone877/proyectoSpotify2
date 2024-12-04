package Repository;

import Service.Contenido;
import java.util.ArrayList;
import java.util.List;

public class Novedades {
    private List<Contenido> nuevosContenidos;

    public Novedades() {
        this.nuevosContenidos = new ArrayList<>();
    }

    public void agregarContenido(Contenido contenido) {
        nuevosContenidos.add(contenido);
        System.out.println("Contenido añadido a novedades: " + contenido.getTitulo());
    }

    public List<Contenido> obtenerNovedades() {
        return nuevosContenidos;
    }

    // Método para mostrar las novedades
    public void mostrarNovedades() {
        System.out.println("Novedades:");
        for (Contenido contenido : nuevosContenidos) {
            System.out.println("- " + contenido.getTitulo());
        }
    }

    public List<Contenido> getNuevosContenidos() {
        return nuevosContenidos;
    }

    public void setNuevosContenidos(List<Contenido> nuevosContenidos) {
        this.nuevosContenidos = nuevosContenidos;
    }
    
}
