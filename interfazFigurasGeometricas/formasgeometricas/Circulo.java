package formasgeometricas;

// Implementación para un círculo
public class Circulo implements Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio= radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
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
