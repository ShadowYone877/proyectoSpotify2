package Service;
import Repository.Preferencias;
public class Perfil {
    private String nombre;
    private String idioma;
    private Preferencias preferencia;

    public Perfil(String nombre, String idioma, Preferencias preferencia) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.preferencia = preferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public Preferencias getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencias preferencia) {
        this.preferencia = preferencia;
    }
}
