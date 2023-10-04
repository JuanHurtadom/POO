
package notasestudiante;


public class Estudiante {
    private  double nota1 = 0, nota2 = 0, nota3 = 0;
   
    public Estudiante(){
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;        
    }
    public Estudiante (double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public Estudiante(Estudiante objEstudiante){
        this.nota1 = objEstudiante.nota1;
        this.nota2 = objEstudiante.nota2;
        this.nota3 = objEstudiante.nota3;
    }
    
    public double getNota1 (){
        return nota1;
    }
     public double getNota2 (){
        return nota2;
    }
      public double getNota3 (){
        return nota3;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    
    
    public double calcularNotaFinal(){
        return (this.nota1 + this.nota2)/2 *0.70 + (this.nota3)*0.30;
    }
    
    public void imprimir(){
        System.out.println("La nota 1 es: " + this.nota1);
        System.out.println("La nota 2 es: " + this.nota2);
        System.out.println("La nota 3 es: " + this.nota3);
        System.out.println("La nota final es: " + calcularNotaFinal());
    }
}
