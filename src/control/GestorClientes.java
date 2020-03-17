package control;

import modelo.Cliente;

public class GestorClientes {
	int cantidad = 5;
	public Cliente[] clientes;

	public GestorClientes() {
		super();
		clientes = GeneradorClientes.generaClientes(cantidad);
	}

	public Cliente getCliente(Integer id) {
		Cliente retorno = null;
		if (id < clientes.length) {
			retorno = clientes[id];
		}
		return retorno;
	}

}
