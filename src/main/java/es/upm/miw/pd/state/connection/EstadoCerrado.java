package es.upm.miw.pd.state.connection;

public class EstadoCerrado extends Estado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new EstadoPreparado());
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(this);
	}

}
