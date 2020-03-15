package control;

import modelo.Alojamiento;
import modelo.Responsable;
import modelo.Cliente;
import modelo.Estancia;

public class GestorEstancias {
	int cantidad = 10;
	public Estancia[] estancias = new Estancia[cantidad];
	int ultima = 0;

	private boolean addEstancia(Estancia estancia) {
		boolean retorno = false;
		if (ultima < estancias.length) {
			estancias[ultima] = estancia;
			ultima++;
			retorno = true;
		}
		return true;
	}

	public Estancia[] getEstancias() {
		return estancias;
	}

	public boolean addEstancia(Alojamiento alojamientoActual, String entrada, String salida, Responsable clienteActual) {
		boolean retorno = false;
		if (!buscarAlojamiento(alojamientoActual)) {
			addEstancia(new Estancia(alojamientoActual, entrada, salida, clienteActual));
			retorno = true;
		}
		return retorno;
	}

	private boolean buscarAlojamiento(Alojamiento alojamiento) {
		boolean retorno = true;
		for (int i = 0; i < ultima && retorno; i++) {
			retorno = estancias[i].getAlojamiento().equals(alojamiento);
		}
		return false;
	}

	public StringBuilder mostrarEstancias() {
		StringBuilder mensaje = new StringBuilder();
		for (int i = 0; i < ultima; i++) {
			mensaje.append(estancias[i].toString());
			mensaje.append("\n");
		}
		return mensaje;
	}
}
