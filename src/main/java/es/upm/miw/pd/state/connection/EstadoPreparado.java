package es.upm.miw.pd.state.connection;

public class EstadoPreparado implements IEstado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(this);
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new EstadoCerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new EstadoParado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(this);
	}

	@Override
	public void enviar(Conexion conexion) {
		conexion.setEstado(new EstadoEsperando());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException(unsupportedOperation);
		
	}
	
	@Override
	public Estado literal() {
		return Estado.PREPARADO;
	}

}
