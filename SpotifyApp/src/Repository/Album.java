package Repository;
import Model.Song;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private String artista;
    private List<Song> canciones;

    public Album(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    public void agregarCanción(Song cancion) {
        canciones.add(cancion);
    }

    public List<Song> obtenerCanciones() {
        return canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<Song> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Song> canciones) {
        this.canciones = canciones;
    }

}

