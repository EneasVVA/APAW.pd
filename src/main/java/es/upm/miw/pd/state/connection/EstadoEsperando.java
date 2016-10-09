package es.upm.miw.pd.state.connection;

public class EstadoEsperando implements IEstado {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException(unsupportedOperation);
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException(unsupportedOperation);
		
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
		
			conexion.setEstado(
					(respuesta > 0) 
							? new EstadoCerrado()
							: new EstadoPreparado()
							);
	}
	
	@Override
	public Estado literal() {
		return Estado.ESPERANDO;
	}
}
