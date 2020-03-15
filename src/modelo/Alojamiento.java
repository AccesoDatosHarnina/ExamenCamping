package modelo;

public abstract class Alojamiento implements Responsable{
	public int id;
	public int personas;
	public int superficie;
	

			
	public Alojamiento(int id, int personas, int superficie) {
		super();
		this.id = id;
		this.personas = personas;
		this.superficie = superficie;
	}

	@Override
	public boolean equals(Object obj) {
		return id==((Alojamiento)obj).id;
	}

	public String presenta() {
		return "Responsable propio alojamiento:"+id+" dispone de  "+(superficie/personas)+" m por persona";
	}
	@Override
	public String toString() {
		return " con id:"+id;
	}
}
