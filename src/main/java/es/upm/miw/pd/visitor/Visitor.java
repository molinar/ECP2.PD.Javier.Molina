package es.upm.miw.pd.visitor;

public abstract class Visitor {
    public abstract void visitElementA(ElementA e);

    public abstract void visitElementB(ElementB e);
    
    public abstract int getAs();
    
    public abstract int getBs();

}
