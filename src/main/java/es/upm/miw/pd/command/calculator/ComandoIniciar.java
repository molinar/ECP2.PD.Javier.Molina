package es.upm.miw.pd.command.calculator;

public class ComandoIniciar extends ComandoPadre{

   
    public ComandoIniciar (Calculadora calculadora){
        super(calculadora);  
      }
      

    @Override
    public void execute() {
        getCalculadora().iniciar();        
    }

    @Override
    public String name() {
        return "Iniciar";
    }
}
