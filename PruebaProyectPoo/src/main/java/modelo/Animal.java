package modelo;

public abstract class Animal implements Vendible{
    private String nombre;
    private int edad;
    private double precio;
    private boolean disponible;
    private Especie especie;

    //Getter and Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Constructores

    public Animal(String nombre, int edad, double precio, boolean disponible, Especie especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
        this.disponible = disponible;
        this.especie = especie;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Especie: " + getEspecie());
    };

    //Metodos abstractos
    public abstract void hacerSonido();
}
