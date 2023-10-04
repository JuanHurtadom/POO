package repasoConstrucor;

public class Caja {
    private int largo, ancho, alto;
    
    //Contructor por defecto
    public Caja(){
        this.largo = 2;
        this.ancho = 3; 
        this.alto = 4;
    }
    //COntructor parametrizado 
    public Caja(int largo, int ancho, int alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        
    }
    //consstrcutor por copoia 
    public Caja(Caja objCaja){
        this.largo = objCaja.largo;
        this.ancho = objCaja.ancho;
        this.alto = objCaja.alto;
    } 
    
    //Getter and Setter
    
    public int getLargo (){
        return largo;
    }
    
    public int getAncho (){
        return ancho;
    }
    public int getAlto (){
        return alto;
    }
    
    public void setLargo(int largo){
        this.largo = largo;
    }
    public void setAncho (int ancho){
        this.ancho = ancho;
    }
    public void setAlto (int alto){
        this.alto = alto;
    }
    
    public int calcularArea(){
        return(this.largo * this.ancho * this.alto); 
    }
    
    public void mostrar(){
        System.out.println("El largo es: " + this.largo);
        System.out.println("El ancho es: " + this.ancho);
        System.out.println("El alto es: " + this.alto);
        System.out.println("El volumen es: " + calcularArea());
        
    }
}
