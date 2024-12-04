package Service;

public abstract class Contenido {
    private String id;
    private String titulo;
    private int duracion; 

    public Contenido(String id, String titulo, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public abstract void reproducir();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
