package ventana;

import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
import java.awt.Component;
import java.awt.ScrollPane;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import modelo.Delincuente;
import Model.usuariosModel;
import Model.ConexionDB;

public class panelPrincipal2 extends JPanel {

	
	private Border border;
	private JTextField nombreTextField;
	private JTextField idTextField;
	private JTextField edadTextField;
	private JTextField nacionalidadTextField;
	private JTextField apellidosTextField;
	private JComboBox usuariosDesplegable;
	private usuariosModel usuariosModel;
	private panelPrincipal2 boton;
	
	
	public panelPrincipal2() {
		
		String HOST="localhost";
		String BBDD="thelaby";
		String USER="root";
		String PASS="";
		
		ConexionDB conBD = new ConexionDB(HOST, BBDD, USER, PASS);
		
		ConexionDB usuariosDb = new ConexionDB("localhost", "thelaby", "root", "");
	
		setLayout(null);
		
		usuariosDesplegable = new JComboBox();
		usuariosDesplegable.setBounds(31, 58, 125, 38);
		add(usuariosDesplegable);
		
		usuariosModel = new usuariosModel();
		
		Iterator<String> it = this.usuariosModel.getUsuarios().Iterator();
		
		while(it.hasNext()){
			String usuario = it.next();
			usuariosDesplegable.addItem(usuario);
		}
		
		JLabel lblNombre = new JLabel("Nombre"); //texto 'nombre' que hay arriba del desplegable.
		lblNombre.setBounds(257, 26, 79, 14);
		add(lblNombre);
		
		JLabel lblApellidos = new JLabel("1er Apellido"); 
		lblApellidos.setBounds(257, 103, 79, 14);
		add(lblApellidos);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.setBounds(290, 352, 135, 23);
		add(btnSiguiente);
		
		border = LineBorder.createGrayLineBorder();
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(371, 26, 79, 14);
		add(lblId);
		
		nombreTextField = new JTextField();
		nombreTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nombreTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		nombreTextField.setBounds(257, 51, 91, 30);
		add(nombreTextField);
		
		idTextField = new JTextField();
		idTextField.setHorizontalAlignment(SwingConstants.CENTER);
		idTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		idTextField.setBounds(361, 51, 64, 30);
		add(idTextField);
		
		edadTextField = new JTextField();
		edadTextField.setHorizontalAlignment(SwingConstants.CENTER);
		edadTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		edadTextField.setBounds(257, 199, 149, 30);
		add(edadTextField);
		
		JLabel lblEdad = new JLabel("2\u00BA Apellido");
		lblEdad.setBounds(257, 174, 79, 14);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(257, 257, 79, 14);
		add(lblNacionalidad);
		
		nacionalidadTextField = new JTextField();
		nacionalidadTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nacionalidadTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		nacionalidadTextField.setBounds(257, 282, 149, 30);
		add(nacionalidadTextField);
		
		apellidosTextField = new JTextField();
		apellidosTextField.setHorizontalAlignment(SwingConstants.CENTER);
		apellidosTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		apellidosTextField.setBounds(257, 128, 149, 30);
		add(apellidosTextField);
		
		JButton button = new JButton("<< Atras");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(boton!=null)
					visualizarPanelPrincipal2();
		button.setBounds(21, 352, 135, 23);
		add(button);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(21, 26, 79, 14);
		add(lblEquipo);
	}

			private void visualizarPanelPrincipal2() {
				panelPrincipal2.paintAll(boton);
				
			}
}