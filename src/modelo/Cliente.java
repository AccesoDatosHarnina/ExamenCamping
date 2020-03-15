package modelo;

public class Cliente implements Responsable {
	public String dni;
	public int anno;
	public int annoAlta;

	public Cliente(String dni, int anno, int annoAlta) {
		super();
		this.dni = dni;
		this.anno = anno;
		this.annoAlta = annoAlta;
	}

	public String presenta() {
		return "cliente con dni:"+dni+" es responsable y se hizo socio con "+(annoAlta-anno);
	}

}
