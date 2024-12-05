import UI.ExploreMenu;
import UI.MainMenu;
public class App {
    public static void main(String[] args) {
        MainMenu menuPrincipal = new MainMenu();
        ExploreMenu exploreMenu = new ExploreMenu();
        menuPrincipal.mostrarMenu();
        exploreMenu.mostrar();
    }
}

