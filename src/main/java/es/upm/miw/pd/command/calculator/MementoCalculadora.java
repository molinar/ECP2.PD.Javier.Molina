package es.upm.miw.pd.command.calculator;

public class MementoCalculadora {

    private int valor;

    private String cadena;

    public MementoCalculadora(int valor, String cadena) {
        this.valor = valor;
        this.cadena = cadena;
    }

    public int getValor() {
        return this.valor;
    }

    public String getCadena() {
        return this.cadena;
    }

}
