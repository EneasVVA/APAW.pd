package es.upm.miw.pd.state.connection;

public class EstadoReady extends Estado {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstado(new EstadoEsperando());
	}

}
