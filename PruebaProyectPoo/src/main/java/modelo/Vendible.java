package modelo;

public interface Vendible {
    public double calcularDescuento();
    public boolean estaDisponible();
    public double getPrecioFinal();
}
