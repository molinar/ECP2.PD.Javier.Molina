package es.upm.miw.pd.command.calculator;

public abstract class ComandoPadre implements Comando{
    
    private Calculadora calculadora;
    
    private CalculadoraMementable calculadoraMementable;
    
    public ComandoPadre(Calculadora calculadora){
        this.calculadora = calculadora;
    }
    
    public ComandoPadre(CalculadoraMementable calculadoraMementable){
        this.calculadoraMementable = calculadoraMementable;
    }
    public abstract void execute();

    public abstract String name();
    
    public Calculadora getCalculadora(){
        return this.calculadora;
    }
    
    public CalculadoraMementable getCalculadoraMementable(){
        return this.calculadoraMementable;
    }

}
