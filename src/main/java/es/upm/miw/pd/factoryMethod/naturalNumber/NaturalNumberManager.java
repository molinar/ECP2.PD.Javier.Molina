package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
    private NaturalNumber naturalNumber;

    private NaturalNumberCreator creator;

    public void createNaturalNumber(int value) {
        this.naturalNumber = this.creator.createNaturalNumber(value);
    }

    public void setNaturalNumberCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public NaturalNumber getNaturalNumber() {
        return naturalNumber;
    }

}
