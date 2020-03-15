package modelo;

public class Estancia {
	public Alojamiento alojamiento;
	public String entrada,salida;
	public Responsable campable;
	
	public Estancia(Alojamiento alojamiento, String entrada, String salida, Responsable campable) {
		super();
		this.alojamiento = alojamiento;
		this.entrada = entrada;
		this.salida = salida;
		this.campable = campable;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public String getEntrada() {
		return entrada;
	}
	public String getSalida() {
		return salida;
	}
	public Responsable getCampable() {
		return campable;
	}
	@Override
	public String toString() {
		return alojamiento.toString()+" con entrada "+entrada+" y salida "+salida+" asociado a  "+campable.presenta();
	}
}
