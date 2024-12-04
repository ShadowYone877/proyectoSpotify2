package Model;
import Service.Perfil;
public class FreeUser extends User {
    public FreeUser(String nombre, String email, Perfil perfil) {
        super(nombre, email, perfil);
    }

    @Override
    public String obtenerTipoUsuario() {
        return "Usuario Gratis";
    }

    public void escucharConPublicidad() {
        System.out.println("Escuchando con publicidad...");
    }
}

