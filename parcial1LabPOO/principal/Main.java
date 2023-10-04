package principal;

import proceso.EmpleadoAsalariado;
import proceso.EmpleadoPorHoras;
public class Main {

   
    public static void main(String[] args) {
        
       
        
        EmpleadoAsalariado[] empleadoA = new EmpleadoAsalariado[5];
        EmpleadoPorHoras[] empleadoB = new EmpleadoPorHoras[5];
        
        empleadoA[0] = new EmpleadoAsalariado(50000,"Juan",500000);
        empleadoA[1] = new EmpleadoAsalariado(60000,"Santiago",1500000);
        empleadoA[2] = new EmpleadoAsalariado(80000,"Gonzalo",5000000);
        empleadoA[3] = new EmpleadoAsalariado(65000,"David",1300000);
        empleadoA[4] = new EmpleadoAsalariado(55000,"Laura",900000);
        
        empleadoB[0] = new EmpleadoPorHoras(58,8300,"Camila",0);
        empleadoB[1] = new EmpleadoPorHoras(48,9300,"Jose",0);
        empleadoB[2] = new EmpleadoPorHoras(46,10300,"Maria",0);
        empleadoB[3] = new EmpleadoPorHoras(50,7300,"Sebastian",0);
        empleadoB[4] = new EmpleadoPorHoras(62,6300,"Sofia",0);
         
        System.out.println("-------------------------");
        System.out.println("EMPLEADOS ASALARIADOS: ");
        System.out.println("-------------------------");
        for(int i = 0; i < empleadoA.length; i++){
            empleadoA[i].calcularSalario();
            
        }
        System.out.println("-------------------------");
        System.out.println("EMPLEADOS POR HORAS: ");
        System.out.println("-------------------------");
        for(int i = 0; i < empleadoB.length; i++){
            empleadoB[i].calcularSalario();
            
        }
        
        //Cambiar datos de Empleado Por Horas #1
        System.out.println("-------------------------");
        System.out.println("Nombre cambiado para Empleado Por Horas #1");
        System.out.println("-------------------------");
        empleadoB[0].setNombre("Jhon David");
        for(int i = 0; i < empleadoB.length; i++){
            empleadoB[i].calcularSalario();
            
        }
        
        //Obtener un empleado en especifico
        System.out.println("-------------------------");
        System.out.println("EMPLEADO EN ESPECIFICO");
        System.out.println("-------------------------");
        
        System.out.println("Empleado " + empleadoB[1].getNombre() + " Con un salario de: " + empleadoB[1].getSalarioBase() );
        
    }
    
}
