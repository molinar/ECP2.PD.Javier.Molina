package es.upm.miw.pd.text;

public abstract class Componente {
    
    public abstract String dibujar(boolean mayuscula);

    public abstract void add(Componente componente);
    
    public abstract void remove(Componente componente);
    
    public abstract boolean esCompuesto();

}
