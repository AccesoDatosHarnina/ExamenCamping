package control;

import modelo.Alojamiento;
import modelo.Bungalow;
import modelo.Caravana;

public class GestorAlojamientos {
	int cantidad = 11;
	public Alojamiento alojamientos[];

	public GestorAlojamientos() {
		alojamientos = GeneradorAlojamientos.generaAlojamientos(cantidad);
	}

	public Alojamiento getAlojamiento(int id) {
		Alojamiento retorno = null;
		if (alojamientos.length > id) {
			retorno = alojamientos[id];
		}
		return retorno;
	}

}
