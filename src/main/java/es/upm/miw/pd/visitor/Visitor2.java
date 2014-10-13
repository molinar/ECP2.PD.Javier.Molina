package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

    private int totalA;

    private int totalB;

    @Override
    public void visitElementA(ElementA e) {
        totalA ++;
    }

    @Override
    public void visitElementB(ElementB e) {
        totalB ++;
    }

    @Override
    public int getAs() {
        return totalA;
    }

    @Override
    public int getBs() {
        return totalB;
    }

}
