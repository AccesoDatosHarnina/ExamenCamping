package control;

import modelo.Alojamiento;
import modelo.Cliente;

public class Controlador {
	GestorAlojamientos alojamientos = new GestorAlojamientos();
	GestorClientes clientes = new GestorClientes();
	GestorEstancias estancias = new GestorEstancias();

	public boolean darAltaEstancia(String alojamiento, String entrada, String salida, String cliente) {
		Alojamiento alojamientoActual = alojamientos.getAlojamiento(Integer.valueOf(alojamiento));
		boolean retorno = false;
		if (!cliente.isEmpty()) {
			Cliente clienteActual = clientes.getCliente(Integer.valueOf(cliente));
			if (alojamientoActual != null && clienteActual != null) {
				retorno = estancias.addEstancia(alojamientoActual, entrada, salida, clienteActual);
			}
		}else {
			retorno = estancias.addEstancia(alojamientoActual, entrada, salida, alojamientoActual);
		}
		
		return retorno;
	}

	public StringBuilder mostrarEstancias() {

		return estancias.mostrarEstancias();
	}

}
