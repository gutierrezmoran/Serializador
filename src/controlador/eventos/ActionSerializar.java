package controlador.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import controlador.Bridge;

public class ActionSerializar implements MouseListener {

	private Bridge bridge;

	public ActionSerializar(Bridge bridge) {
		this.bridge = bridge;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = ((JButton) e.getSource());
		b.setBackground(b.getBackground().darker());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = ((JButton) e.getSource());
		b.setBackground(b.getBackground().brighter());
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
