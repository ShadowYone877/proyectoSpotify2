package Service;

import java.util.ArrayList;
import java.util.List;

public class GestionDeUsuarios {
    private List<Usuario> usuarios;

    public GestionDeUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public Usuario buscarUsuario(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado con email: " + email);
        return null;
    }

    public void eliminarUsuario(Usuario usuario) {
        if (usuarios.remove(usuario)) {
            System.out.println("Usuario eliminado: " + usuario.getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}

