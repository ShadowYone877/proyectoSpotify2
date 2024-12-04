package Service;

import Model.User;
import java.util.ArrayList;
import java.util.List;

public class GestionDeUsuarios {
    private List<User> usuarios;

    public GestionDeUsuarios() {
        this.usuarios = new ArrayList<>();
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
        this.usuarios = usuarios;
    }
    
}

