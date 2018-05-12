package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class UI extends JFrame {

	private final Color ERROR = new Color(220, 20, 60);
	private final Color CORRECTO = new Color(60, 179, 113);
	protected JPanel contentPane;
	protected JTextField nombre;
	protected JTextField domicilio;
	protected JButton serializar;
	protected JTextField domicilioBuscar;
	protected JComboBox<String> boxNombre;
	private JLabel mensaje;
	protected JButton ruta;
	protected JButton rutaBuscar;

	public UI() {
		setResizable(false);
		setTitle("Serializador");
		setMinimumSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSerializadorNombre = new JLabel("SERIALIZADOR\r\n");
		panel.add(lblSerializadorNombre, BorderLayout.SOUTH);
		lblSerializadorNombre.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblSerializadorNombre.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSerializadorNombre.setForeground(new Color(32, 178, 170));
		lblSerializadorNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSerializadorNombre.setBorder(new EmptyBorder(10, 0, 0, 20));
		lblSerializadorNombre.setOpaque(true);
		lblSerializadorNombre.setBackground(new Color(0, 139, 139));
		lblSerializadorNombre.setFont(new Font("Arial", Font.BOLD, 40));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setRequestFocusEnabled(false);
		tabbedPane.setOpaque(true);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(0, 139, 139));
		tabbedPane.setUI(new MyTabbedPane());
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel tabSerializar = new JPanel();
		tabSerializar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tabSerializar.setBackground(new Color(233, 235, 238));
		tabbedPane.addTab("Serializar", null, tabSerializar, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		tabSerializar.setLayout(new BorderLayout(0, 0));
		
		JPanel datosSerializar = new JPanel();
		datosSerializar.setOpaque(false);
		tabSerializar.add(datosSerializar, BorderLayout.NORTH);
		datosSerializar.setBorder(null);
		datosSerializar.setLayout(new BorderLayout(0, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBorder(new EmptyBorder(5, 20, 20, 20));
		datosSerializar.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 10));
		
		JPanel panelNombre = new JPanel();
		panel_4.add(panelNombre, BorderLayout.NORTH);
		panelNombre.setOpaque(false);
		panelNombre.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelNombre.add(lblNombre, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setOpaque(false);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.controlHighlight));
		panelNombre.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		nombre = new JTextField();
		nombre.setBackground(Color.WHITE);
		panel_2.add(nombre);
		nombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nombre.setBorder(new EmptyBorder(7, 7, 7, 7));
		
		JPanel panelDomicilio = new JPanel();
		panel_4.add(panelDomicilio, BorderLayout.SOUTH);
		panelDomicilio.setOpaque(false);
		panelDomicilio.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDomicilio.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelDomicilio.add(lblDomicilio, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.controlHighlight));
		panelDomicilio.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		domicilio = new JTextField();
		panel_1.add(domicilio);
		domicilio.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		domicilio.setBorder(new EmptyBorder(7, 7, 7, 7));
		
		JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		datosSerializar.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		ruta = new JButton("");
		ruta.setFocusPainted(false);
		ruta.setContentAreaFilled(false);
		ruta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_8.add(ruta, BorderLayout.EAST);
		ruta.setHorizontalTextPosition(SwingConstants.RIGHT);
		ruta.setHorizontalAlignment(SwingConstants.RIGHT);
		ruta.setBorder(new EmptyBorder(4, 4, 4, 4));
		ruta.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ruta.setBackground(new Color(213, 213, 213));
		
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		tabSerializar.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 5));
		
		serializar = new JButton("Serializar persona");
		panel_5.add(serializar);
		serializar.setFocusPainted(false);
		serializar.setBorderPainted(false);
		serializar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		serializar.setForeground(Color.WHITE);
		serializar.setBackground(Color.DARK_GRAY);
		serializar.setFont(new Font("Gadugi", Font.BOLD, 13));
		serializar.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		mensaje = new JLabel();
		mensaje.setBorder(new EmptyBorder(5, 0, 5, 0));
		mensaje.setOpaque(true);
		mensaje.setForeground(Color.WHITE);
		mensaje.setVisible(false);
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(mensaje, BorderLayout.NORTH);
		
		JPanel tabBuscar = new JPanel();
		tabBuscar.setBackground(new Color(233, 235, 238));
		tabbedPane.addTab("Buscar", null, tabBuscar, null);
		tabbedPane.setBackgroundAt(1, Color.WHITE);
		tabBuscar.setLayout(new BorderLayout(0, 0));
		
		JPanel datosBuscar = new JPanel();
		datosBuscar.setOpaque(false);
		datosBuscar.setBorder(null);
		tabBuscar.add(datosBuscar, BorderLayout.NORTH);
		datosBuscar.setLayout(new BorderLayout(0, 3));
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(new EmptyBorder(5, 20, 20, 20));
		datosBuscar.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 10));
		
		JPanel panelNombreBuscar = new JPanel();
		panel_6.add(panelNombreBuscar, BorderLayout.NORTH);
		panelNombreBuscar.setOpaque(false);
		panelNombreBuscar.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBorder(new EmptyBorder(5, 0, 5, 0));
		panelNombreBuscar.add(label, BorderLayout.NORTH);
		
		boxNombre = new JComboBox<String>();
		boxNombre.getEditor().getEditorComponent().setBackground(Color.WHITE);
		boxNombre.setPreferredSize(new Dimension(28, 29));
		boxNombre.setBorder(null);
		panelNombreBuscar.add(boxNombre, BorderLayout.SOUTH);
		
		JPanel panelDomicilioBuscar = new JPanel();
		panel_6.add(panelDomicilioBuscar, BorderLayout.SOUTH);
		panelDomicilioBuscar.setOpaque(false);
		panelDomicilioBuscar.setLayout(new BorderLayout(0, 0));
		
		JLabel Domicilio = new JLabel("Domicilio");
		panelDomicilioBuscar.add(Domicilio, BorderLayout.NORTH);
		Domicilio.setFont(new Font("Tahoma", Font.BOLD, 13));
		Domicilio.setBorder(new EmptyBorder(5, 0, 5, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.controlHighlight));
		panel_3.setOpaque(false);
		panelDomicilioBuscar.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		domicilioBuscar = new JTextField();
		domicilioBuscar.setFont(new Font("Tahoma", Font.BOLD, 17));
		domicilioBuscar.setDisabledTextColor(Color.BLACK);
		domicilioBuscar.setEnabled(false);
		domicilioBuscar.setEditable(false);
		domicilioBuscar.setBackground(new Color(225, 227, 230));
		domicilioBuscar.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel_3.add(domicilioBuscar);
		domicilioBuscar.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		datosBuscar.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		rutaBuscar = new JButton("");
		rutaBuscar.setFocusPainted(false);
		rutaBuscar.setContentAreaFilled(false);
		rutaBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_7.add(rutaBuscar, BorderLayout.EAST);
		rutaBuscar.setHorizontalTextPosition(SwingConstants.RIGHT);
		rutaBuscar.setHorizontalAlignment(SwingConstants.RIGHT);
		rutaBuscar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rutaBuscar.setBorder(new EmptyBorder(4, 4, 4, 4));
		rutaBuscar.setBackground(new Color(213, 213, 213));
	}
	
	public void mostrarMensajeError() {
		this.mensaje.setText("Campos vacios o nombre repetido");
		this.mensaje.setBackground(this.ERROR);
		this.mensaje.setVisible(true);
	}
	
	public void mostrarMensaje() {
		this.mensaje.setText("Persona agregada correctamente");
		this.mensaje.setBackground(this.CORRECTO);
		this.mensaje.setVisible(true);
	}
	
	public void resetCampos() {
		this.nombre.setText("");
		this.domicilio.setText("");
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public JTextField getDomicilio() {
		return domicilio;
	}

	public JButton getSerializar() {
		return serializar;
	}

	public JTextField getDomicilioBuscar() {
		return domicilioBuscar;
	}

	public JComboBox<String> getBoxNombre() {
		return boxNombre;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public Color getError() {
		return this.ERROR;
	}

	public Color getCorrecto() {
		return this.CORRECTO;
	}

	public JButton getRuta() {
		return ruta;
	}

	public JButton getRutaBuscar() {
		return rutaBuscar;
	}

}
