package controlador.eventos;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

import controlador.Bridge;
import modelo.Persona;

public class ActionBuscar implements ItemListener {
	
	private Bridge bridge;
	
	public ActionBuscar(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		this.bridge.mostrarDomicilio(((JComboBox) e.getSource()).getSelectedIndex());
	}

}
