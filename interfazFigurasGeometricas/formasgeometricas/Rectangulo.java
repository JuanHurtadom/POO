
package formasgeometricas;


public class Rectangulo implements Forma{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
        
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return ((base*2)+(altura*2));
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
