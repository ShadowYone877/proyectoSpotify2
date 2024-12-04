package Repository;
import Model.Song;
import java.util.ArrayList;
import java.util.List;

public class PlayList  {
    private String nombre;
    private String propietario;
    public List<Song> canciones;

    public PlayList(String nombre, String propietario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.canciones = new ArrayList<>();
    }

    public void agregarCanción(Song cancion) {
        canciones.add(cancion);
    }

    public void eliminarCanción(Song cancion) {
        canciones.remove(cancion);
    }

    public void reproducirTodas() {
        for (Song cancion : canciones) {
            cancion.reproducir();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public List<Song> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Song> canciones) {
        this.canciones = canciones;
    }

}

