package es.upm.miw.pd.observer.persona;

import upm.jbb.IO;


public final class MainObserver {
    private MainObserver() {
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        new Vista(persona);
        IO.in.addModel(persona);
        persona.setNombre("Javier");
        persona.setEdad(28);
    }
    
}
