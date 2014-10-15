package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoPadre {

    private GestorMementos<MementoCalculadora> gestorMementos;

    private Mementable<MementoCalculadora> calculadora;

    public ComandoDeshacer(CalculadoraMementable calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        this.calculadora.deshacer(this.gestorMementos.getMemento((String) IO.in.select(this.gestorMementos.keys(), "Deshacer")));
    }

    @Override
    public String name() {
        return "Deshacer";
    }

}
