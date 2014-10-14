package es.upm.miw.pd.command.calculator;

public abstract class ComandoPadre implements Comando{
    
    private Calculadora calculadora;
    
    public ComandoPadre(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    public abstract void execute();

    public abstract String name();
    
    public Calculadora getCalculadora(){
        return this.calculadora;
    }

    



}
