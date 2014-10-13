package es.upm.miw.pd.visitor;

public class Visitor1 extends Visitor {

    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeA());
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visitador 1 --> elemento: " + e.getAttributeB());
    }

    @Override
    public int getAs() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getBs() {
        // TODO Auto-generated method stub
        return 0;
    }

}
