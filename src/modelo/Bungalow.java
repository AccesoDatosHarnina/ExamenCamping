package modelo;

public class Bungalow extends Alojamiento {
	public boolean cocina=true;

	public Bungalow(int id, int personas, boolean cocina) {
		super(id, personas,50);
		this.cocina = cocina;
	}

	@Override
	public String toString() {
		return "el bungalow"+super.toString();
	}
}
