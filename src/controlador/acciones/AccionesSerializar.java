package controlador.acciones;

import java.io.File;
import java.io.IOException;
import controlador.Bridge;
import modelo.Persona;

public class AccionesSerializar {

	private Bridge bridge;
	
	public AccionesSerializar(Bridge bridge) {
		super();
		this.bridge = bridge;
	}
	
	public boolean comprobarCamposRellenados() {
		return !this.bridge.getNombre().getText().equals("") && !this.bridge.getDomicilio().getText().equals("");
	}

	public void serializar() {
		this.bridge.serializar(new Persona(this.bridge.getNombre().getText(), this.bridge.getDomicilio().getText()));
	}
	
	public void agregarAComboBox() {
		this.bridge.getBoxNombre().addItem(this.bridge.getNombre().getText());
	}
	
	public void actualizarRutaSerializacion() {
		String r;
		try {
			r = getFile().getCanonicalPath();
		} catch (IOException e1) {
			r = System.getProperty("user.dir");
		}
		
		this.bridge.getRuta().setText(r);
		this.bridge.getRutaBuscar().setText(r);
	}

	public File getFile() {
		return bridge.getFile();
	}
	
}
