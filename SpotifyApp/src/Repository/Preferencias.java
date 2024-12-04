package Repository;

import Model.Genero;
import java.util.ArrayList;
import java.util.List;

public class Preferencias {
    private List<Genero> generosFavoritos;

    public Preferencias() {
        this.generosFavoritos = new ArrayList<>();
    }

    public void agregarGéneroFavorito(Genero genero) {
        if (!generosFavoritos.contains(genero)) {
            generosFavoritos.add(genero);
            System.out.println("Género favorito añadido: " + genero.getNombre());
        }
    }

    public List<Genero> obtenerGénerosFavoritos() {
        return generosFavoritos;
    }

    // Método para mostrar géneros favoritos
    public void mostrarGénerosFavoritos() {
        System.out.println("Géneros favoritos:");
        for (Genero genero : generosFavoritos) {
            System.out.println("- " + genero.getNombre());
        }
    }
}

