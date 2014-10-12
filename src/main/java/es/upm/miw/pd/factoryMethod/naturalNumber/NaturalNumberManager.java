package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
    private NaturalNumber naturalNumber;
    
    private NaturalNumberCreator creator;
    
    public void setCreator(NaturalNumberCreator creator){
        this.creator = creator;
    }
    
    public void createNaturalNumber(int value){
        this.naturalNumber = this.creator.createNaturalNumber(value);
    }
    
    public String getTextValue(){
        return this.naturalNumber.getTextValue();
    }

}
