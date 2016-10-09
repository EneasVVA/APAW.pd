package es.upm.miw.pd.state.connection;

public interface IEstado {

	String unsupportedOperation = "Operación no soportada para el estado";
	
	public void abrir(Conexion conexion);

	public void cerrar(Conexion conexion);

	public void parar(Conexion conexion);

	public void iniciar(Conexion conexion);

	public void enviar(Conexion conexion);

	public void recibir(Conexion conexion, int respuesta);
	
	public Estado literal();

	
}
