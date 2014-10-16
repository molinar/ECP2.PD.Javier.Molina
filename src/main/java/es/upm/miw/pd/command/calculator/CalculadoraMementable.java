package es.upm.miw.pd.command.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable<CalculadoraMementable> {

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
    public CalculadoraMementable guardar() {
        CalculadoraMementable calculadoraMementable = new CalculadoraMementable();
        calculadoraMementable.setTotal(getTotal());
        return calculadoraMementable;
        
    }

    @Override
    public void deshacer(CalculadoraMementable calculadoraMementable) {
        this.setTotal(calculadoraMementable.getTotal());
    }

}
