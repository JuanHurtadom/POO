package formasgeometricas;

// Implementación para un cuadrado
public class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    @Override
    public double calcularHipotenusa(){
        return 0;
    }
    @Override
    public double calcularAngulo(){
    return 0;
    }
}
