import modelo.Especie;
import modelo.Gato;
import modelo.Perro;

public class main {
    public static void main(String[] args){
        Gato gato=new Gato("Pedro", 2, 200F, true, Especie.GATO, true, new String[]{"Naranja", "Negro", "Blanco"});
        gato.mostrarInfo();


    }
}
