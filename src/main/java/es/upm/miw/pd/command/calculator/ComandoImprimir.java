package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoPadre{

    public ComandoImprimir (Calculadora calculadora){
        super(calculadora);  
      }
      

    @Override
    public void execute() {
        IO.out.println("Total: " +  getCalculadora().getTotal());
    }

    @Override
    public String name() {
        return "Imprimir";
    }

}
