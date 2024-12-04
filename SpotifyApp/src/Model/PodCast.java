package Model;

import java.util.ArrayList;
import java.util.List;

public class PodCast {
    private String titulo;
    private String anfitrión;
    private List<String> episodios;

    public PodCast(String titulo, String anfitrión) {
        this.titulo = titulo;
        this.anfitrión = anfitrión;
        this.episodios = new ArrayList<>();
    }

    public void reproducirEpisodio(int indice) {
        if (indice >= 0 && indice < episodios.size()) {
            System.out.println("Reproduciendo episodio: " + episodios.get(indice));
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void agregarEpisodio(String episodio) {
        episodios.add(episodio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnfitrión() {
        return anfitrión;
    }

    public void setAnfitrión(String anfitrión) {
        this.anfitrión = anfitrión;
    }

    public List<String> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<String> episodios) {
        this.episodios = episodios;
    }


}

