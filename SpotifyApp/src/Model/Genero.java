package Model;

import java.util.ArrayList;
import java.util.List;
public class Genero {
    private String nombre;
    private List<Song> canciones;

    public Genero(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCanción(Song cancion) {
        canciones.add(cancion);
    }

    public List<Song> obtenerCancionesPopulares() {
        return canciones.subList(0, Math.min(canciones.size(), 5));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Song> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Song> canciones) {
        this.canciones = canciones;
    }


}

