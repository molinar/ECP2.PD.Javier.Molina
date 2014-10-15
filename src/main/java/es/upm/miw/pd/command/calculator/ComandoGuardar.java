package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoPadre {

    private GestorMementos<MementoCalculadora> gestorMementos;

    private Mementable<MementoCalculadora> calculadora;

    public ComandoGuardar(CalculadoraMementable calculadora) {
        super(calculadora);
    }

    @Override
    public void execute() {
        this.gestorMementos.addMemento(IO.in.readString("Nombre de guardado"),
                this.calculadora.guardar());
    }

    @Override
    public String name() {
        return "Guardar";
    }

}
