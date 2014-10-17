package es.upm.miw.pd.text;

public class Parrafo extends Compuesto {

    @Override
    public void add(Componente componente) {
        if (componente.esCompuesto()) {
            throw new UnsupportedOperationException("Acción no permitida");
        } else {
            this.addComponente(componente);
        }
    }

    @Override
    public void remove(Componente componente) {
        if (componente.esCompuesto()) {
            throw new UnsupportedOperationException("Acción no permitida");
        } else {
            this.removeComponente(componente);
        }
    }

    @Override
    public boolean esCompuesto() {
        return true;
    }

    @Override
    protected String separador() {
        return "\n";
    }

}
