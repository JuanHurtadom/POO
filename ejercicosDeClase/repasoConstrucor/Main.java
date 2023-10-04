package repasoConstrucor;
import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        //Primer objeto con constructor por defecto
        
        Caja objCaja1 = new Caja();
        
        int ancho, largo, alto;
        System.out.println("Ingrese largo: ");
        largo = scan.nextInt();
        System.out.println("Ingrese ancho: ");
        ancho = scan.nextInt();
        System.out.println("Ingrese alto: ");
        alto = scan.nextInt();
        
        //Fijando los valores en el primer objeto
        objCaja1.setLargo(largo);
        objCaja1.setAncho(ancho);
        objCaja1.setAlto(alto);
        
        System.out.println("Objeto con constructor por defencto: ");
        objCaja1.mostrar();
        
        //Segundo objeto con constructor parametrizado
        Caja objCaja2 = new Caja(4,2,5);
        System.out.println("Objeto con constructor parametrizado: ");
        objCaja2.mostrar();
        
        //tercer objeto con constructor por copia
        Caja objCaja3 = new Caja(objCaja1);
        objCaja3.mostrar();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
    
}
