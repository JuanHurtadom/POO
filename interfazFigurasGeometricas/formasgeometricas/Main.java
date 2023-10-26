package formasgeometricas;

/*
  contexto de un sistema que maneja diferentes formas geométricas. Imagina que tienes una interfaz
  Forma con métodos para calcular el área y el perímetro de la forma. Luego, tienes clases que implementan esta interfaz para formas específicas,
  como un cuadrado y un círculo.
*/
/*
  En este ejemplo:
  
  La interfaz Forma define métodos calcularArea() y calcularPerimetro() que deben ser implementados por las clases que la utilicen.
  Las clases Cuadrado y Circulo implementan la interfaz Forma proporcionando implementaciones específicas para los métodos de cálculo.
  En la función main, se crean instancias de Cuadrado y Circulo, y se calculan y muestran sus áreas y perímetros.
*/
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTriangulo = new Triangulo (5,6);
        Rectangulo miRectangulo = new Rectangulo(4,7);
        Pentagono miPentagono = new Pentagono (4.1, 6);

        // Calcular y mostrar áreas y perímetros
        System.out.println("---------------------------------");
        System.out.println("            CUADRADO             ");
        System.out.println("---------------------------------");
        System.out.println("Area del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("---------------------------------");
        System.out.println("            CIRCULO             ");
        System.out.println("---------------------------------");
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());
        
        System.out.println("---------------------------------");
        System.out.println("           TRIANGULO            ");
        System.out.println("---------------------------------");
        System.out.println("Hipotenusa del triangulo: " + miTriangulo.calcularHipotenusa());
        System.out.println("Area del triangulo: " + miTriangulo.calcularArea());
        System.out.println("Perimetro del triangulo: " + miTriangulo.calcularPerimetro());
        System.out.println("Angulo alfa del triangulo (radianes): " + miTriangulo.calcularAngulo());
    
        System.out.println("---------------------------------");
        System.out.println("            RECTANGULO             ");
        System.out.println("---------------------------------");
        System.out.println("Area del Rectangulo " + miRectangulo.calcularArea());
        System.out.println("Perimetro del Rectangulo: " + miRectangulo.calcularPerimetro());
        
         System.out.println("---------------------------------");
        System.out.println("            PENTAGONO            ");
        System.out.println("---------------------------------");
        System.out.println("Area del Pentagono: " + miPentagono.calcularArea());
        System.out.println("Perimetro del Pentagono: " + miPentagono.calcularPerimetro());
          
     
    }
}

/*
  Este ejemplo ilustra cómo las interfaces en Java pueden ser utilizadas para definir un contrato común
  (en este caso, métodos para calcular área y perímetro) que varias clases pueden implementar de manera específica.
  Este enfoque facilita la extensión del sistema para incluir nuevas formas geométricas sin modificar el código existente.
*/