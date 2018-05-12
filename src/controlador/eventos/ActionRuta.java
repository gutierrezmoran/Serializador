package controlador.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import controlador.Bridge;
import javax.swing.JButton;

public class ActionRuta implements MouseListener {
	
	Bridge bridge;

	public ActionRuta(Bridge bridge) {
		super();
		this.bridge = bridge;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.bridge.abrirRutaTrabajo();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		((JButton) e.getSource()).setContentAreaFilled(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		((JButton) e.getSource()).setContentAreaFilled(false);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
