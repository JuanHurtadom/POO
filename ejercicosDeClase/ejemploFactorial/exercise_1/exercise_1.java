
package exercise_1;

public class exercise_1 {
    
    public static void main(String[] args) {        
        
       exercise_1 ex = new exercise_1();
              
        System.out.println( ex.factorial(4));
        
        System.out.println( ex.factorialRecursiva(5));
        
    }
    
     public int factorialRecursiva(int num){
        if( num == 0 || num == 1 ){
           return  1;
       }
        return factorialRecursiva( num-1 ) * num;
    }
    public int factorial(int num){
        int aux = 1;
        for(int a = 1; a <= num; a++){
            aux = aux * a;
        }
        return aux;
    }
}
