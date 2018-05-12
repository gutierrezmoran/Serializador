package controlador.eventos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import controlador.Bridge;

public class ActionNombre implements KeyListener {
	
	Bridge bridge;

	public ActionNombre(Bridge bridge) {
		super();
		this.bridge = bridge;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (this.bridge.comprobarCamposRellenados()
					&& !this.bridge.isNombreRepetido(this.bridge.getNombre().getText())) {
				bridge.serializar();
				this.bridge.mostrarMensaje();
				this.bridge.agregarAComboBox();
				this.bridge.resetCampos();
			} else {
				this.bridge.mostrarMensajeError();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(this.bridge.isNombreRepetido(this.bridge.getNombre().getText())) {
			this.bridge.getNombre().setBackground(this.bridge.getError());
		} else {
			this.bridge.getNombre().setBackground(Color.WHITE);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
