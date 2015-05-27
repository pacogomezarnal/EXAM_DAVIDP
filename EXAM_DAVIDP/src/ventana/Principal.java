package ventana;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.CardLayout;


public class Principal extends JFrame {

	private JPanel contentPane; //cuadro de app	
	panelPrincipal panelPrincipal=new panelPrincipal(); //se declara el panelPrincipal1
	panelPrincipal2 panelPrincipal2=new panelPrincipal2();//se declara el panelPrincipal2
	panelPrincipal3 panelPrincipal3=new panelPrincipal3();//se declara el panelPrincipal3
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 487);

		contentPane = new JPanel(); //JPanel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); //borde de la app.
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0)); //cardLayout para tener un panel principal y subpaneles.
		
		contentPane.add(panelPrincipal, "PanelPrincipal"); //carga el panel del panel principal1 
		contentPane.add(panelPrincipal2, "PanelPrincipal2"); //carga el panel del panel principal2
		contentPane.add(panelPrincipal3, "PanelPrincipal3"); //carga el panel del panel principal3 
		
		
			}
}

