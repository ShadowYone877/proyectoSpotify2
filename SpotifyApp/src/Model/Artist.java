package Model;
import Repository.Album;
import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String nombre;
    private List<Album> albums;
    private List<Song> canciones;

    public Artist(String nombre) {
        this.nombre = nombre;
        this.albums = new ArrayList<>();
        this.canciones = new ArrayList<>();
    }

    public List<Song> obtenerCancionesPopulares() {
        return canciones.subList(0, Math.min(canciones.size(), 5)); // Ejemplo
    }

    public void agregarAlbum(Album album) {
        albums.add(album);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Song> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Song> canciones) {
        this.canciones = canciones;
    }

}

