package es.upm.miw.pd.state.connection;

public class Parado extends State {

    @Override
    public void abrir(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void cerrar(Conexion conexion) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void iniciar(Conexion conexion) {
        conexion.setState(new Preparado());
    }

    @Override
    public void parar(Conexion conexion) {

    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }

}
