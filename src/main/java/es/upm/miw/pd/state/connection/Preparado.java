package es.upm.miw.pd.state.connection;

public class Preparado extends State{

    @Override
    public void abrir(Conexion conexion) {
        
    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setState(new Cerrado());
        
    }

    @Override
    public void iniciar(Conexion conexion) {
        
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setState(new Parado());
        
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.setState(new Esperando());
        conexion.getLink().enviar(msg);
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
