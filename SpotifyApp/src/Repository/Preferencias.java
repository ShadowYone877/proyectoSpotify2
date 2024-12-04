package Repository;

import Model.Genero;
import java.util.ArrayList;
import java.util.List;

public class Preferencias {
    private List<Genero> generosFavoritos;

    public Preferencias() {
        this.generosFavoritos = new ArrayList<>();
    }

    public void agregarGeneroFavorito(Genero genero) {
        if (!generosFavoritos.contains(genero)) {
            generosFavoritos.add(genero);
            System.out.println("Género favorito añadido: " + genero.getNombre());
        }
    }

    public List<Genero> obtenerGenerosFavoritos() {
        return generosFavoritos;
    }

    // Método para mostrar géneros favoritos
    public void mostrarGenerosFavoritos() {
        System.out.println("Géneros favoritos:");
        for (Genero genero : generosFavoritos) {
            System.out.println("- " + genero.getNombre());
        }
    }

    public List<Genero> getGenerosFavoritos() {
        return generosFavoritos;
    }

    public void setGenerosFavoritos(List<Genero> generosFavoritos) {
        this.generosFavoritos = generosFavoritos;
    }
    
}

