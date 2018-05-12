package controlador.acciones;

import controlador.Bridge;
import modelo.Persona;

public class AccionesBuscar {
	
	private Bridge bridge;
	
	public AccionesBuscar(Bridge bridge) {
		super();
		this.bridge = bridge;
	}

	public void mostrarDomicilio(int indice) {
		Persona p = (Persona) this.bridge.deserializar(indice);
		this.bridge.getDomicilioBuscar().setText(p.getDomicilio());
	}
}
