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

public class panelPrincipal3 extends JPanel {

	
	private Border border;
	private JTextField idTextField;
	private JTextField mensajeTextField;
	private JTextField apellidoTextField;

	
	public panelPrincipal3() {
		setLayout(null);
		
		JLabel lblApellido = new JLabel("1er Apellido"); 
		lblApellido.setBounds(146, 26, 79, 14);
		add(lblApellido);
		
		JButton btnComprobar = new JButton("comprobar");
		btnComprobar.setBounds(119, 135, 135, 23);
		add(btnComprobar);
		
		border = LineBorder.createGrayLineBorder();
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(32, 26, 79, 14);
		add(lblId);
		
		idTextField = new JTextField();
		idTextField.setHorizontalAlignment(SwingConstants.CENTER);
		idTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		idTextField.setBounds(28, 51, 64, 30);
		add(idTextField);
		
		mensajeTextField = new JTextField();
		mensajeTextField.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		mensajeTextField.setBounds(55, 206, 364, 30);
		add(mensajeTextField);
		
		apellidoTextField = new JTextField();
		apellidoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		apellidoTextField.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		apellidoTextField.setBounds(136, 51, 149, 30);
		add(apellidoTextField);
		
		JButton button = new JButton("<< Atras");
		button.setBounds(21, 352, 135, 23);
		add(button);
	}
}