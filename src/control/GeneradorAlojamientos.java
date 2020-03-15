package control;

import modelo.Alojamiento;
import modelo.Bungalow;
import modelo.Caravana;

public class GeneradorAlojamientos {

	public static Alojamiento[] generaAlojamientos(int cantidad) {
		Alojamiento alojamientos[] = new Alojamiento[cantidad];
		int i = 0;
		for (; i < alojamientos.length / 2; i++) {
			alojamientos[i] = new Caravana(i + 1, 2, i + "-mat");
		}
		for (; i < alojamientos.length; i++) {
			alojamientos[i] = new Bungalow(i + 1, 4, true);
		}
		return alojamientos;
	}
}
