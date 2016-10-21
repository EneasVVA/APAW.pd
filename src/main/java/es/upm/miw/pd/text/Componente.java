package es.upm.miw.pd.text;

public abstract class Componente {
	private boolean esCompuesto;
	
	public Componente(boolean esCompuesto){
		this.esCompuesto = esCompuesto;
	}
	
	public abstract String dibujar(boolean enMayus);
	
	public abstract void add(Componente c);
	
	public abstract void remove(Componente c);
	
	public boolean esCompuesto(){
		return esCompuesto;
	}
}
