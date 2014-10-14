package es.upm.miw.pd.observer.persona;

public class Persona extends Observable{
    
    private String nombre;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        this.notificar();
    }

    public void setEdad(int edad){
        this.edad = edad;
        this.notificar();
    }
    

}
