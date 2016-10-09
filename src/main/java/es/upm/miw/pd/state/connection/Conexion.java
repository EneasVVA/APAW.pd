package es.upm.miw.pd.state.connection;

public class Conexion {
	private IEstado estado;

	private Link link;


	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		setEstado(new EstadoCerrado());
	}

	void setEstado(IEstado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return this.estado.literal();
	}
	
	public Link getLink() {
		return link;
	}


	public void abrir() {
		estado.abrir(this);
	}
	
	public void cerrar() {
		estado.cerrar(this);
	}
	

	public void parar() {
		estado.parar(this);
	}

	public void iniciar() {
		estado.iniciar(this);
	}

	public void enviar(String msg) {
		estado.enviar(this);
		link.enviar(msg);
	}

	public void recibir(int respuesta) {
		estado.recibir(this, respuesta);
	}

}
