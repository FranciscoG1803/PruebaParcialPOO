package modelo;

import java.lang.reflect.Array;

public class Perro extends Animal{
    private String raza;
    private String[] historialVacunas;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String[] getHistorialVacunas() {
        return historialVacunas;
    }

    public void setHistorialVacunas(String[] historialVacunas) {
        this.historialVacunas = historialVacunas;
    }

    public Perro(String nombre, int edad, double precio, boolean disponible, Especie especie, String raza, String[] historialVacunas) {
        super(nombre, edad, precio, disponible, especie);
        this.raza = raza;
        this.historialVacunas = historialVacunas;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miauuuuuuuu");
    }

    @Override
    public double calcularDescuento() {
        return (getPrecio() * 50)/100;
    }

    @Override
    public boolean estaDisponible() {
        if(isDisponible()) {
            System.out.println("Si se encuentra disponible la mascota");
            return true;
        }

        else {
            System.out.println("No se encuentra disponible");
            return false;
        }
    }

    @Override
    public double getPrecioFinal() {
        System.out.println("El precio final de la compra sera de: " + calcularDescuento());
        return 0;
    }
}
