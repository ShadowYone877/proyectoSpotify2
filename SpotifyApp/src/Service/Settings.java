package Service;

public class Settings {
    private boolean modoOscuro;
    private boolean notificacionesActivadas;

    public Settings(boolean modoOscuro, boolean notificacionesActivadas) {
        this.modoOscuro = modoOscuro;
        this.notificacionesActivadas = notificacionesActivadas;
    }

    public void activarModoOscuro() {
        modoOscuro = true;
        System.out.println("Modo oscuro activado.");
    }

    public void desactivarModoOscuro() {
        modoOscuro = false;
        System.out.println("Modo oscuro desactivado.");
    }

    public void activarNotificaciones() {
        notificacionesActivadas = true;
        System.out.println("Notificaciones activadas.");
    }

    public void desactivarNotificaciones() {
        notificacionesActivadas = false;
        System.out.println("Notificaciones desactivadas.");
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public boolean isNotificacionesActivadas() {
        return notificacionesActivadas;
    }
}

