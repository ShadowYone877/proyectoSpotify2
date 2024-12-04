package Service;

import Model.FreeUser;
import Model.PremiumUser;
import Model.User;
import Repository.Preferencias;
import java.util.ArrayList;
import java.util.List;

public class GestionDeUsuarios {
    private static List<User> usuarios;
    public List<User> usuarios1;
    public static void createUsers() {
        Perfil perfil1 = new Perfil("Juan Pérez", "Español", new Preferencias());
        FreeUser usuarioGratis = new FreeUser("Juan", "juan@mail.com", perfil1);

        Perfil perfil2 = new Perfil("María Gómez", "Inglés", new Preferencias());
        Suscripcion suscripciónPremium = new Suscripcion("Mensual", 9.99, true);
        PremiumUser usuarioPremium = new PremiumUser("María", "maria@mail.com", perfil2, suscripciónPremium);

        usuarios.add(usuarioGratis);
        usuarios.add(usuarioPremium);
    }
    public static void showUsers() {
        // Verificar si la lista está vacía
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios disponibles.");
        } else {
            System.out.println("=== Usuarios ===");
            // Recorrer la lista de usuarios y mostrarlos
            for (User usuario : usuarios) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Correo: " + usuario.getEmail());
                System.out.println("Tipo: " + usuario.obtenerTipoUsuario());
                System.out.println();
            }
        }
    }
    public GestionDeUsuarios() {
        this.usuarios1 = new ArrayList<>();
    }

    public void registrarUsuario(User usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public User buscarUsuario(String email) {
        for (User usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado con email: " + email);
        return null;
    }

    public void eliminarUsuario(User usuario) {
        if (usuarios.remove(usuario)) {
            System.out.println("Usuario eliminado: " + usuario.getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios1 = usuarios;
    }
    
}

