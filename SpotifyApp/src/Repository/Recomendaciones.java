package Repository;

import Model.Genero;
import Model.Song;
import Model.User;
import java.util.ArrayList;
import java.util.List;

public class Recomendaciones extends Preferencias  {
    private User usuario;
    
    public Recomendaciones(User usuario) {
        this.usuario = usuario;
    }

    public List<Song> generarRecomendaciones() {
        // Ejemplo simple: devolver contenido basado en géneros favoritos
        List<Song> recomendaciones = new ArrayList<>();
        for (Genero genero : usuario.getPerfil().getPreferencia().getGenerosFavoritos()) {
            for(Song cancion : genero.obtenerCancionesPopulares()){
                recomendaciones.add(cancion);

            }
        }
        System.out.println("Recomendaciones generadas para " + usuario.getNombre());
        return recomendaciones;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
    
}
