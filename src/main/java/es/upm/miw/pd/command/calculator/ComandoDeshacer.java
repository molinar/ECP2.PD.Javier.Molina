package es.upm.miw.pd.command.calculator;

public class ComandoDeshacer extends ComandoPadre{
    
    public ComandoDeshacer (Calculadora calculadora){
        super(calculadora);  
      }
      
    @Override
    public void execute() {
           
    }

    @Override
    public String name() {
        return "Deshacer";
    }

}
