package modelo;

public class Gato extends Animal{

    private boolean esDeInterior;
    private String[] colores;

    public boolean isEsDeInterior() {
        return esDeInterior;
    }

    public void setEsDeInterior(boolean esDeInterior) {
        this.esDeInterior = esDeInterior;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public Gato(String nombre, int edad, double precio, boolean disponible, Especie especie, boolean esDeInterior, String[] colores) {
        super(nombre, edad, precio, disponible, especie);
        this.esDeInterior = esDeInterior;
        this.colores = colores;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Es de interior: " + esDeInterior);
        for (int i = 0; i < colores.length; i++) {
            System.out.println("------------------");
            System.out.println("Historial de vacunas");
            System.out.println(colores[i]);
            System.out.println("------------------");
        }
        System.out.println("Precio con descuento: " + getPrecioFinal());
    };

    @Override
    public void hacerSonido() {
        System.out.println("Miauuuuuuuu");
    }

    @Override
    public double calcularDescuento() {
        return (getPrecio() * 40)/100;
    }

    @Override
    public boolean estaDisponible() {
        if(isDisponible()) {
            System.out.println("Si se encuentra disponible");
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
