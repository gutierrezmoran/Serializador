package controlador.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import controlador.Bridge;

public class ActionEnter implements KeyListener {
	
	Bridge bridge;

	public ActionEnter(Bridge bridge) {
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
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
