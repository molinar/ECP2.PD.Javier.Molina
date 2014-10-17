package es.upm.miw.pd.text;

public class Texto extends Compuesto {

    @Override
    public void add(Componente componente) {
        if (componente.esCompuesto()) {
            this.addComponente(componente);
        } else {
            throw new UnsupportedOperationException("Acción no permitida");
        }
    }

    @Override
    public void remove(Componente componente) {
        if (componente.esCompuesto()) {
            this.removeComponente(componente);
        } else {
            throw new UnsupportedOperationException("Acción no permitida");
        }
    }
    
    @Override
    public boolean esCompuesto() {
        return true;
    }

    @Override
    protected String separador() {
        return "---o---\n";
    }

}
