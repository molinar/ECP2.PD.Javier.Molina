package es.upm.miw.pd.decorator.vehicle;

public abstract class Extra extends Vehiculo {
    
    private Vehiculo vehiculo;
    
    public Extra(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    
}
