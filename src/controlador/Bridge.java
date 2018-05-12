package controlador;

import java.io.File;
import controlador.acciones.AccionesBuscar;
import controlador.acciones.AccionesSerializar;
import controlador.eventos.ActionBuscar;
import controlador.eventos.ActionEnter;
import controlador.eventos.ActionNombre;
import controlador.eventos.ActionRuta;
import controlador.eventos.ActionSerializar;
import modelo.Gestor;
import vista.UI;

public class Bridge extends UI {

	private Gestor gestor;
	private AccionesSerializar accionesSerializar;
	private AccionesBuscar accionesBuscar;
	
	public Bridge() {
		this.gestor = new Gestor(this);
		this.accionesSerializar = new AccionesSerializar(this);
		this.accionesBuscar = new AccionesBuscar(this);
		establecerListeners();
		actualizarRutaSerializacion();
	}
	
	public void establecerListeners() {
		serializar.addMouseListener(new ActionSerializar(this));
		boxNombre.addItemListener(new ActionBuscar(this));
		nombre.addKeyListener(new ActionNombre(this));
		domicilio.addKeyListener(new ActionEnter(this));
		ruta.addMouseListener(new ActionRuta(this));
		rutaBuscar.addMouseListener(new ActionRuta(this));
	}
	
	public Object deserializar(int posicion) {
		return this.gestor.deserializar(posicion);
	}

	public boolean isNombreRepetido(String n) {
		return gestor.isNombreRepetido(n);
	}

	public void serializar(Object obj) {
		gestor.serializar(obj);
	}

	public void serializar() {
		accionesSerializar.serializar();
	}

	public void mostrarDomicilio(int indice) {
		accionesBuscar.mostrarDomicilio(indice);
	}

	public boolean comprobarCamposRellenados() {
		return accionesSerializar.comprobarCamposRellenados();
	}

	public void agregarAComboBox() {
		accionesSerializar.agregarAComboBox();
	}

	public void actualizarRutaSerializacion() {
		accionesSerializar.actualizarRutaSerializacion();
	}

	public File getFile() {
		return gestor.getFile();
	}

	public void abrirRutaTrabajo() {
		gestor.abrirRutaTrabajo();
	}

	public void actualizarComboBox() {
		gestor.actualizarComboBox();
	}
	
}
