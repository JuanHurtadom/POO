package formasgeometricas;

import static java.lang.Math.asin;
import static java.lang.Math.sqrt;


public class Triangulo implements Forma{
    private double cateA, cateO;

    public Triangulo(double cateA, double cateO) {
        this.cateA = cateA;
        this.cateO = cateO;
    }
        
    @Override
    public double calcularHipotenusa(){
        return sqrt((cateA * cateA)+(cateO * cateO)) ;
    }
    
    @Override
    public double calcularArea() {
        return (cateA * cateO)/2;
    }

    @Override
    public double calcularPerimetro() {
        return cateA + cateO + calcularHipotenusa() ;
    }
    
    @Override
    public double calcularAngulo(){
    return asin(cateA/calcularHipotenusa());
    }
}
