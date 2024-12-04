package Model;
import Service.Contenido;
import Service.Perfil;
import Service.Suscripcion;
public class PremiumUser extends User {
    private Suscripcion suscripción;

    public PremiumUser(String nombre, String email, Perfil perfil, Suscripcion suscripción) {
        super(nombre, email, perfil);
        this.suscripción = suscripción;
    }

    @Override
    public String obtenerTipoUsuario() {
        return "Usuario Premium";
    }

    public void descargarContenido(Contenido contenido) {
        System.out.println("Descargando: " + contenido.getTitulo());
    }

    public Suscripcion getSuscripción() {
        return suscripción;
    }

    public void setSuscripción(Suscripcion suscripción) {
        this.suscripción = suscripción;
    }
}
