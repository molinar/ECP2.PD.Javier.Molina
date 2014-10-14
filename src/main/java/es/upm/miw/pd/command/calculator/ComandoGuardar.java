package es.upm.miw.pd.command.calculator;


public class ComandoGuardar extends ComandoPadre{
    
    public ComandoGuardar (Calculadora calculadora){
        super(calculadora);  
      }
      
    @Override
    public void execute() {
           
    }

    @Override
    public String name() {
        return "Guardar";
    }

}
