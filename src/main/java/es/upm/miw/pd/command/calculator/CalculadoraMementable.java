package es.upm.miw.pd.command.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable {
    
    public CalculadoraMementable(){
        super();
    }

    @Override
    public MementoCalculadora guardar() {
        return new MementoCalculadora();
    }

    @Override
    public void Deshacer(MementoCalculadora memento) {
        this.setTotal(memento.getValor());
        
    }


}
