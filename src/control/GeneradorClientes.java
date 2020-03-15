package control;

import modelo.Cliente;

public class GeneradorClientes {

	public static Cliente[] generaClientes(int cantidad) {
		 Cliente[] clientes=new Cliente[cantidad];
		for (int i = 0; i < clientes.length; i++) {
			clientes[i]=new Cliente(String.valueOf(i+1*1000),1960+i,2016-i);
		}
		return clientes;
	}


}
