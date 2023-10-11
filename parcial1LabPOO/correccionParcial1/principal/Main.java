package principal;

import proceso.EmpleadoAsalariado;
import proceso.EmpleadoPorHoras;

public class Main {

    public static void main(String[] args) {

        EmpleadoAsalariado[] empleadoA = {
            new EmpleadoAsalariado(50000, "Juan", 500000),
            new EmpleadoAsalariado(60000, "Santiago", 1500000),
            new EmpleadoAsalariado(80000, "Gonzalo", 5000000),
            new EmpleadoAsalariado(65000, "David", 1300000),
            new EmpleadoAsalariado(55000, "Laura", 900000)
        };

        EmpleadoPorHoras[] empleadoB = {
            new EmpleadoPorHoras(58, 8300, "Camila", 0),
            new EmpleadoPorHoras(48, 9300, "Jose", 0),
            new EmpleadoPorHoras(46, 10300, "Maria", 0),
            new EmpleadoPorHoras(50, 7300, "Sebastian", 0),
            new EmpleadoPorHoras(62, 6300, "Sofia", 0)
        };

        imprimirSalarios(empleadoA, "EMPLEADOS ASALARIADOS");
        imprimirSalarios(empleadoB, "EMPLEADOS POR HORAS");

        // Cambiar nombre de Empleado Por Horas #1
        empleadoB[0].setNombre("Jhon David");
        imprimirSalarios(empleadoB, "EMPLEADOS POR HORAS (Nombre de la persona 1 modificado)");

        // Obtener un empleado específico
        EmpleadoPorHoras empleadoEspecifico = empleadoB[1];
         System.out.println("-------------------------");
        System.out.println("EMPLEADO EN ESPECIFICO");
         System.out.println("-------------------------");
        System.out.println("Empleado " + empleadoEspecifico.getNombre() + " con un salario de: " + empleadoEspecifico.getSalarioBase());
    }

    public static void imprimirSalarios(proceso.Empleado[] empleados, String tipo) {
        System.out.println("-------------------------");
        System.out.println(tipo);
        System.out.println("-------------------------");

        for (proceso.Empleado empleado : empleados) {
            empleado.calcularSalario();
        }
    }
}





