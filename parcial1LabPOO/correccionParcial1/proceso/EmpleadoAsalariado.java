
package proceso;


public class EmpleadoAsalariado extends Empleado{
    private double deducciones;

    public EmpleadoAsalariado(double deducciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }
        
    
    @Override
    public void calcularSalario() {
        this.salarioBase = this.salarioBase - this.deducciones; 
        System.out.println("El salario base de " + getNombre() + " seria de: " + getSalarioBase());
    }
    
    
}
