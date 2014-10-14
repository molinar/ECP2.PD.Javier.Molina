package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoSumar extends ComandoPadre{
    
    public ComandoSumar (Calculadora calculadora){
        super(calculadora);  
      }
      
    @Override
    public void execute() {
        int valor = IO.in.readInt();
        getCalculadora().sumar(valor);        
    }

    @Override
    public String name() {
        return "Sumar";
    }

}
