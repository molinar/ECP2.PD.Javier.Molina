package es.upm.miw.pd.text;

public class Caracter extends Componente {
    
    private char caracter;
    
    public Caracter(char caracter){
        this.caracter = caracter;
    }

    @Override
    public void add(Componente componente) {
        if(componente.esCompuesto()){
            throw new UnsupportedOperationException("Acción no permitida");
        }
    }

    @Override
    public void remove(Componente componente) {

    }

    @Override
    public String dibujar(boolean mayuscula) {
        if(mayuscula){
            return String.valueOf(caracter).toUpperCase();
        }else{
            return String.valueOf(caracter);
        }
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }

}
