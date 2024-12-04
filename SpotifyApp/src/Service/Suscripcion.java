package Service;

public class Suscripcion {
    private String tipo; // Ejemplo: "Mensual", "Anual"
    private double costo;
    private boolean activa;

    public Suscripcion(String tipo, double costo, boolean activa) {
        this.tipo = tipo;
        this.costo = costo;
        this.activa = activa;
    }

    public void cancelar() {
        this.activa = false;
        System.out.println("Suscripción cancelada.");
    }

    public void reactivar() {
        this.activa = true;
        System.out.println("Suscripción reactivada.");
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}

