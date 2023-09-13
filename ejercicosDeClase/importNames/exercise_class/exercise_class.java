package exercise_class;
import call.unicauca.edu.co.ex_atrr;

public class exercise_class {
    
    public static void main(String[] args) {
        
        ex_atrr atrr = new ex_atrr();
        
        System.out.println("Access var:  ");
        System.out.println("Import name 1: " + atrr.name);
             
        atrr.name = "Santiago";
        System.out.println("Import name 2: " + atrr.name);
        System.out.println("Import year: " + atrr.year_hbd);
    }
    
}
