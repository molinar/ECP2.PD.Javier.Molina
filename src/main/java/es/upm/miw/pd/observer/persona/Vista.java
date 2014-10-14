package es.upm.miw.pd.observer.persona;

import upm.jbb.IO;

public class Vista implements Observador {
    
    private Persona persona;
    
    public Vista(Persona persona){
        this.persona = persona;
        this.persona.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.setStatusBar(persona.getNombre()+ " " + persona.getEdad());
    }
    
    

}
