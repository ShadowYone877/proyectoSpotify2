package Model;
import Service.Perfil;
public abstract class User {
    private final String nombre;
    private final String email;
    private Perfil perfil;

    public User(String nombre, String email, Perfil perfil) {
        this.nombre = nombre;
        this.email = email;
        this.perfil = perfil;
    }

    public abstract String obtenerTipoUsuario();

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

