//Juan José Hurtado MOlano
package poo_1;

public class POO_1 {

    public static void main(String[] args) {
        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "Juan";

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Hola " + nombre);

        //Crear una instancia de la clase POO_1 
        POO_1 instance = new POO_1();

        //Lamar al método action de la instancia creada
        int result = instance.sum(1, 2);
        System.out.println(result);

    }

    public int sum(int num1, int num2) {
        // System.out.println("Resultado: " + (num1 + num2));
        return (num1 + num2);
    }

}
