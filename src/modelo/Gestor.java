package modelo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import controlador.Bridge;

public class Gestor {

	private Bridge bridge;
	private String path;
	private File file;
	private FileOutputStream flujoEscritura;
	private FileInputStream flujoLectura;
	private ObjectInputStream lectorObjeto;
	private ObjectOutputStream escritorObjeto;

	public Gestor(Bridge bridge) {
		super();
		this.bridge = bridge;
		this.path = "object.dat";
		this.file = new File(path);
		actualizarComboBox();
	}

	public boolean serializar(Object obj) {
		boolean existe = file.exists();
		try {
			flujoEscritura = new FileOutputStream(this.file, true);

			if (!existe) {
				escritorObjeto = new ObjectOutputStream(flujoEscritura);
			} else {
				escritorObjeto = new BlockHeaderObjectOutputStream(flujoEscritura);
			}
			escritorObjeto.writeObject(obj);
		} catch (IOException e) {
			return false;
		}
		try {
			escritorObjeto.close();
			flujoEscritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public Object deserializar(int posicion) {
		Object obj = null;
		try {
			flujoLectura = new FileInputStream(this.file);
			lectorObjeto = new ObjectInputStream(flujoLectura);
			for (int i = 0; i < posicion; i++) {
				obj = lectorObjeto.readObject();
			}
			obj = lectorObjeto.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			lectorObjeto.close();
			flujoLectura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	private void cargarNombresComboBox() {
		try {
			flujoLectura = new FileInputStream(this.file);
			lectorObjeto = new ObjectInputStream(flujoLectura);
			Object obj = null;

			do {
				obj = lectorObjeto.readObject();
				this.bridge.getBoxNombre().addItem(((Persona) obj).getNombre());
			} while (obj != null);

		} catch (EOFException e) {
			return;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			lectorObjeto.close();
			flujoLectura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void actualizarComboBox() {
		if (file.exists()) {
			cargarNombresComboBox();
		}
	}

	public boolean isNombreRepetido(String n) {
		int c = this.bridge.getBoxNombre().getItemCount();
		for (int i = 0; i < c; i++) {
			if (this.bridge.getBoxNombre().getItemAt(i).equals(n)) {
				return true;
			}
		}
		return false;
	}

	public void abrirRutaTrabajo() {
		Runtime run = Runtime.getRuntime();
		Process p = null;

		try {
			p = run.exec("explorer.exe " + System.getProperty("user.dir"));
		} catch (Exception e) {
			System.out.println("Error al ejecutar");
		}
	}

	public File getFile() {
		return file;
	}

}
