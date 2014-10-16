package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoPadreMemento {

    public ComandoGuardar(CalculadoraMementable calculadora, GestorMementos<CalculadoraMementable> gestorMementos) {
        super(calculadora, gestorMementos);
    }

    @Override
    public void execute() {
        this.getGestorMementos().addMemento(IO.in.readString("Nombre de guardado"),
                this.getCalculadoraMementable().guardar());
        
        
    }

    @Override
    public String name() {
        return "Guardar";
    }

}
