import Service.GestionDeUsuarios;
import UI.MainMenu;
public class App {
    public static void main(String[] args) {
        MainMenu menúPrincipal = new MainMenu();
        menúPrincipal.mostrarMenú();
        GestionDeUsuarios gestionDeUsuarios = new GestionDeUsuarios();
        gestionDeUsuarios.createUsers();
        gestionDeUsuarios.showUsers();
    }
}

