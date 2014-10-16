package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;
    
    private GestorMementos<CalculadoraMementable> gestorMementos;
    

    public MainCalculadora() {
        this.gestorMementos = new GestorMementos<CalculadoraMementable>();
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoGuardar(calc, gestorMementos));
        this.gestor.add(new ComandoDeshacer(calc, gestorMementos));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
