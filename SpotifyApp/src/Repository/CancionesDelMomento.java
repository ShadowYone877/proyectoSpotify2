package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Song;

public class CancionesDelMomento {
    private List<Song> cancionesPopulares;

    public CancionesDelMomento() {
        this.cancionesPopulares = new ArrayList<>();
    }

    public void actualizarCanciones(List<Song> nuevasCanciones) {
        cancionesPopulares.clear();
        cancionesPopulares.addAll(nuevasCanciones);
        System.out.println("Canciones del momento actualizadas.");
    }

    public List<Song> obtenerCanciones() {
        return cancionesPopulares;
    }

    // Método para mostrar las canciones del momento
    public void mostrarCancionesDelMomento() {
        System.out.println("Canciones del Momento:");
        for (Song cancion : cancionesPopulares) {
            System.out.println("- " + cancion.getTitulo());
        }
    }

    public List<Song> getCancionesPopulares() {
        return cancionesPopulares;
    }

    public void setCancionesPopulares(List<Song> cancionesPopulares) {
        this.cancionesPopulares = cancionesPopulares;
    }
    
}