package es.upm.miw.pd.decorator.vehicle;

public class GPS extends Extra{

    public GPS(String modelo, int precio, Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String descripcionFinal() {
        
        return null;
    }

    @Override
    public int precioFinal() {
        // TODO Auto-generated method stub
        return 0;
    }

}
