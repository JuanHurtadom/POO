
package tiposAnimales;


public class Vaca extends Animal {

    private String raza;

    public Vaca(String nombre,String tipo_alimentacion,int edad,String raza){
        super(nombre,tipo_alimentacion,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de hierbas");
    }
}