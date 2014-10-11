package es.upm.miw.pd.composite.expression;

public class Dividir extends Operacion {

    public Dividir(Expresion operando1, Expresion operando2) {
        super(operando1, operando2);
    }

    @Override
    public int operar() {
        return this.getOperando1().operar() / this.getOperando2().operar();
    }

    @Override
    public String getOperador() {
        return "/";
    }

}
