package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoPadreMemento {


    public ComandoDeshacer(CalculadoraMementable calculadora, GestorMementos<CalculadoraMementable> gestorMementos) {
        super(calculadora, gestorMementos);
    }

    @Override
    public void execute() {
        this.getCalculadoraMementable().deshacer(this.getGestorMementos().getMemento((String) IO.in.select(this.getGestorMementos().keys(), "Deshacer")));
    }

    @Override
    public String name() {
        return "Deshacer";
    }

}
