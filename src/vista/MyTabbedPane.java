package vista;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class MyTabbedPane extends BasicTabbedPaneUI {

	private final Insets borderInsets = new Insets(0, 0, 0, 0);

	@Override
	protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
	}

	@Override
	protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex,
			Rectangle iconRect, Rectangle textRect, boolean isSelected) {
	}

	@Override
	protected Insets getContentBorderInsets(int tabPlacement) {
		return borderInsets;
	}

}
