package Model;
import Repository.PlayList;
public class Song {
    private String titulo;
    private String artista;
    private String album;
    private String género;
    private int duracion; // en segundos

    public Song(String titulo, String artista, String album, String género, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.género = género;
        this.duracion = duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void agregarAPlaylist(PlayList playlist) {
        playlist.agregarCanción(this);
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Song [titulo=" + titulo + ", artista=" + artista + ", album=" + album + ", género=" + género
                + ", duracion=" + duracion + "]";
    }
    
}

