package es.upm.miw.pd.command.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {

    private int valor;

    private String cadena;

    public CalculadoraMementable() {
        super();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public MementoCalculadora guardar() {
        return new MementoCalculadora(this.valor, this.cadena);
    }

    @Override
    public void deshacer(MementoCalculadora memento) {
        this.setValor(memento.getValor());
        this.setCadena(memento.getCadena());

    }

}
