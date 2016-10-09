package es.upm.miw.pd.state.connection;

public class EstadoCerrado implements IEstado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new EstadoPreparado());
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(this);
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException(unsupportedOperation);
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException(unsupportedOperation);		
	}

	@Override
	public void enviar(Conexion conexion) {
		throw new UnsupportedOperationException(unsupportedOperation);		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException(unsupportedOperation);		
	}


	@Override
	public Estado literal() {
		return Estado.CERRADO;
	}

	

	
}
