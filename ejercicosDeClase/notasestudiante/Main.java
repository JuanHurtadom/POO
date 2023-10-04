package notasestudiante;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        double nota1, nota2, nota3;
        Scanner scan = new Scanner(System.in);
        
        Estudiante obj1 = new Estudiante();
        System.out.println("Ingrese nota 1: ");
        nota1 = scan.nextDouble();
        System.out.println("Ingrese nota 2: ");
        nota2 = scan.nextDouble();
        System.out.println("Ingrese nota 3: ");
        nota3 = scan.nextDouble();
        
        obj1.setNota1(nota1);
        obj1.setNota2(nota2);
        obj1.setNota3(nota3);
       
        //Primer objeto con constructor por defecto
        System.out.println("OBJETO CON CONSTRUCTOR POR DEFECTO");
        obj1.calcularNotaFinal();
        obj1.imprimir();
        
        //Segundo objeto con constructor parametrizado
        System.out.println("OBJETO CON CONSTRUCTOR PARAMETRIZADO");
        Estudiante obj2 = new Estudiante (3.5, 4,5);
        obj2.calcularNotaFinal();
        obj2.imprimir();
        
        //tercer objeto con constructor por copia;
        System.out.println("OBJETO CON CONSTRUCTOR POR COPIA");
        Estudiante obj3 = new Estudiante (obj1);
        obj3.imprimir();
           
        
        
    }
    
}
