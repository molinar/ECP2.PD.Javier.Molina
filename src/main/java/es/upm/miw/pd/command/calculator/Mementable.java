package es.upm.miw.pd.command.calculator;

public interface Mementable {
    
    void Deshacer(MementoCalculadora memento);

    MementoCalculadora guardar();

}
