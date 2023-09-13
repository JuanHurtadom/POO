package ejemploaMain;
import ejemploProcesos.Circulo;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        
        
        // Crear un objeto Circulo
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        double areaCirculo = circulo.calcularArea();
        System.out.println("Area del circulo: " + areaCirculo);
        
     
       
           
    }
}
