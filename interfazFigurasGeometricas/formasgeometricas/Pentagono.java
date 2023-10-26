
package formasgeometricas;


public class Pentagono implements Forma{
    private double apotema;
    private double lado;

    public Pentagono(double apotema, double lado) {
        this.apotema = apotema;
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        return (calcularPerimetro()*apotema)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado*5;
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