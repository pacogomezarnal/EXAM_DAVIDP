package ventana;

import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class panelPrincipal extends JPanel {

	private JTextField txtJuegos;
	private Border border;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public panelPrincipal() {
		setLayout(null);
		
		txtJuegos = new JTextField();//donde se pone la contraseña vacia
		txtJuegos.setToolTipText("La contraseña debe contener diversos caracteres."); //requisitos de la contraseña
		txtJuegos.setHorizontalAlignment(SwingConstants.CENTER);//fuente de la contraseña
		txtJuegos.setFont(new Font("Sylfaen", Font.PLAIN, 23));//fuente de la contraseña
		txtJuegos.setBounds(257, 131, 149, 30);
		add(txtJuegos);
		
		JLabel lblNombre = new JLabel("Nombre"); //texto 'usuario' que hay arriba del desplegable.
		lblNombre.setBounds(257, 26, 79, 14);
		add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos"); //texto 'contraseña' que hay arriba del JtextField.
		lblApellidos.setBounds(257, 103, 79, 14);
		add(lblApellidos);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(290, 352, 135, 23);
		add(btnLogin);
		
		border = LineBorder.createGrayLineBorder();  //crea el borde del avatar.
		
		JLabel lblAvatar = new JLabel("Avatar");//JLabel donde esta la foto de avatar
		lblAvatar.setIcon(new ImageIcon(panelPrincipal.class.getResource("/images/avatar_1.jpg")));//imagen avatar 
		lblAvatar.setBounds(22, 68, 167, 161);
		
		lblAvatar.setBorder(border);//crea el borde del avatar.
		add(lblAvatar);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(371, 26, 79, 14);
		add(lblId);
		
		textField = new JTextField();
		textField.setToolTipText("La contrase\u00F1a debe contener diversos caracteres.");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		textField.setBounds(257, 51, 91, 30);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("La contrase\u00F1a debe contener diversos caracteres.");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		textField_1.setBounds(361, 51, 64, 30);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("La contrase\u00F1a debe contener diversos caracteres.");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		textField_2.setBounds(257, 199, 149, 30);
		add(textField_2);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(257, 174, 79, 14);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(257, 257, 79, 14);
		add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("La contrase\u00F1a debe contener diversos caracteres.");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		textField_3.setBounds(257, 282, 149, 30);
		add(textField_3);
	}
}