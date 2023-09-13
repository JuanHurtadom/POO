package principal;
import tiposAnimales.Animal;
import tiposAnimales.Caballo;
import tiposAnimales.Gato;
import tiposAnimales.Perro;
import tiposAnimales.Vaca;

public class Main {

    public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	Perro perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.mostrar(); 
        perro.Alimentarse(); 
        System.out.println("------------------------------");
        
        
        //-->Declaracion del objeto Gato
        Gato gato = new Gato("Pelusa","Galletas",15,"Siames");
        gato.mostrar();
        gato.Alimentarse();
        System.out.println("------------------------------");
        
        //-->Declaracion del objeto Caballo
        Caballo caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.mostrar();
        caballo.Alimentarse();
        System.out.println("------------------------------");
        
        //-->Declaracion del objeto Vaca
        Vaca vaca = new Vaca("Margarita","Pasto",20,"Brangus");
        vaca.mostrar();
        vaca.Alimentarse();

    }
}
