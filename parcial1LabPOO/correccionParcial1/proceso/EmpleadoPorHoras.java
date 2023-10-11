package proceso;

public class EmpleadoPorHoras extends Empleado {
    
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaPorHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void calcularSalario() {
        
        this.salarioBase = getTarifaPorHora() * getHorasTrabajadas();
        System.out.println("El salario base de " + getNombre() + " seria de: " + getSalarioBase());
    }
    
    
}
