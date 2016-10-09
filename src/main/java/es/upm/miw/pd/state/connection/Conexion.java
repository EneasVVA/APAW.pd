package es.upm.miw.pd.state.connection;

public class Conexion {
	private Estado estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		setEstado(new EstadoPreparado());
	}

	void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return this.estado;
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
		if (this.estado.equals(Estado.CERRADO)) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
		} else if (this.estado == Estado.PREPARADO) {
			this.estado = Estado.PARADO;
		} else if (this.estado == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			assert false : "estado imposible";
		}
	}

	public void iniciar() {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
			this.estado = Estado.PREPARADO;
		} else if (this.estado == Estado.PREPARADO) {
		} else if (this.estado == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			assert false : "estado imposible";
		}
	}

	public void enviar(String msg) {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PREPARADO) {
			this.link.enviar(msg);
			this.estado = Estado.ESPERANDO;
		} else if (this.estado == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			assert false : "estado imposible";
		}
	}

	public void recibir(int respuesta) {
		if (this.estado == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.PREPARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (this.estado == Estado.ESPERANDO) {
			if (respuesta == 0) {
				this.estado = Estado.PREPARADO;
			} else {
				this.estado = Estado.CERRADO;
			}
		} else {
			assert false : "estado imposible";
		}
	}

}
