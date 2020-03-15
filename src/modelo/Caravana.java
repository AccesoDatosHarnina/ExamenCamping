package modelo;

public class Caravana extends Alojamiento {
	public String matricula;

	public Caravana(int id, int personas, String matricula) {
		super(id, personas,60);
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "La Caravana "+super.toString();
	}
	
}
