package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {

    private List<Componente> listaComponentes;

    public Compuesto() {
        listaComponentes = new ArrayList<Componente>();
    }

    public void addComponente(Componente componente) {
        if (componente != null) {
            this.listaComponentes.add(componente);
        }
    }

    public void removeComponente(Componente componente) {
        if (componente != null) {
            this.listaComponentes.remove(componente);
        }
    }

    public String dibujar(boolean mayuscula) {
        String compuesto = "";
        for (Componente componente : this.listaComponentes) {
            compuesto += componente.dibujar(mayuscula);
        }
        return compuesto + separador();
    }

    protected abstract String separador();

}
