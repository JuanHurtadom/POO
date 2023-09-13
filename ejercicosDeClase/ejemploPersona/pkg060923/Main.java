package pkg060923;
import exercise.Persona;

public class Main {
  
    public static void main(String[] args) {
        //Persona person = new Persona("Juan","Hurtado","12345678"); 
        //Persona person2 = new Persona("Camilo","Vivas","0000000");
        
        //Instanciar objetos Persona y asignarlos al array
        Persona[] arrayPerson = new Persona[3];
        
        arrayPerson[0] = new Persona("Gonzalo " ,"vivas", "12345");
        arrayPerson[1] = new Persona("Juan ","Hurtado", "54321");
        arrayPerson[2] = new Persona("Jose ","Molano", "00000");
        
        
        
        // Imprimir datos de persona #1
        System.out.println("---------------");
        System.out.println(arrayPerson[0].getFirstName());
        System.out.println(arrayPerson[0].getLastName());
        System.out.println(arrayPerson[0].getDocument());
        System.out.println("---------------");
        
        //Ciclo para imprimir solo los nombres y  apellidos, el tope depende del arreglo
         for(int i =0; i < arrayPerson.length; i++ ){
            System.out.println(arrayPerson[i].getFirstName() + arrayPerson[i].getLastName()) ;
        }
        
        //Cambiar datos de persona #1
        arrayPerson[0].setFirstName("Jose");
        arrayPerson[0].setLastName("Molano");
        arrayPerson[0].setDocument("87654321");
        
        //Imprimir los datos cambiados de persona #1
        System.out.println("---------------");
        System.out.println(arrayPerson[0].getFirstName());
        System.out.println(arrayPerson[0].getLastName());
        System.out.println(arrayPerson[0].getDocument());
        System.out.println("---------------");
        
        //Imprimir datos de persona #2
       //System.out.println(person2.getDocument());
        
    }
    
}
