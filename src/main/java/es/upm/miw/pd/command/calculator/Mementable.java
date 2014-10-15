package es.upm.miw.pd.command.calculator;

public interface Mementable<T> {

    T guardar();

    void deshacer(T memento);

}
