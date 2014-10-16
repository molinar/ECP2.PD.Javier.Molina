package es.upm.miw.pd.command.calculator;

public abstract class ComandoPadreMemento extends ComandoPadre {

    private GestorMementos<CalculadoraMementable> gestorMementos;

    public ComandoPadreMemento(CalculadoraMementable calculadoraMementable, GestorMementos<CalculadoraMementable> gestorMementos) {
        super(calculadoraMementable);
        this.setGestorMementos(gestorMementos);
    }

    public GestorMementos<CalculadoraMementable> getGestorMementos() {
        return gestorMementos;
    }

    public void setGestorMementos(GestorMementos<CalculadoraMementable> gestorMementos) {
        this.gestorMementos = gestorMementos;
    }

}
