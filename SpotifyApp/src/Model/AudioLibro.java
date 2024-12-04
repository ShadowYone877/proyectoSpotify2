package Model;

public class AudioLibro {
    private String titulo;
    private String autor;
    private int duracion; // en minutos

    public AudioLibro(String titulo, String autor, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo audiolibro: " + titulo);
    }

    public void marcarComoCompletado() {
        System.out.println("Audiolibro completado: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}

