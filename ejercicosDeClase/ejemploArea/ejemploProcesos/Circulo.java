package ejemploProcesos;

// Clase concreta que extiende la clase FormaGeometrica
public class Circulo extends formaGeometrica {
     private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
