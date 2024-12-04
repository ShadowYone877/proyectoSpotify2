package Repository;

import java.util.ArrayList;
import java.util.List;
import Service.Contenido;
import Model.Genero;

public class Recomendaciones {
    private Usuario usuario;

    public Recomendaciones(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Contenido> generarRecomendaciones() {
        // Ejemplo simple: devolver contenido basado en géneros favoritos
        List<Contenido> recomendaciones = new ArrayList<>();
        for (Genero genero : usuario.getPreferencia().getGénerosFavoritos()) {
            recomendaciones.addAll(genero.obtenerCancionesPopulares());
        }
        System.out.println("Recomendaciones generadas para " + usuario.getNombre());
        return recomendaciones;
    }
}
