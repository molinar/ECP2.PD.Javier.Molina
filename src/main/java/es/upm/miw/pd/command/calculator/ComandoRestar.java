package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoRestar extends ComandoPadre{
    
    public ComandoRestar(Calculadora calculadora){
      super(calculadora);  
    }
    
    @Override
    public void execute() {
        int valor = IO.in.readInt();
        getCalculadora().restar(valor);  
    }

    @Override
    public String name() {
        return "Restar";
    }

}
