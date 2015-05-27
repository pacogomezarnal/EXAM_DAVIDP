package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ventana.panelPrincipal2;

public class usuariosModel {
	
	private Connection con;
	private Statement instruccion; //Representa la consulta de BD que vamos a lanzar.
	private PreparedStatement instruccionUpdate; //Representa una operacion de actualizacion de datos
	private ResultSet usuariosSet; //Lista de usuarios en formato Sql
	
	private String todosSql = "select id,nombre,edad,nacionalidad from thelaby";
	
	private String salvarAntSql = "update delincuentes set antecedentes=? where id=?";
	private List<panelPrincipal2> usuariosList;
	private panelPrincipal2[] usuarios;
	
	public usuariosModel() {
		con = ConexionDB.getConexion();
	}

	public panelPrincipal2[] getpanelPrincipal2() {
		List<panelPrincipal2> delincuentesList = new ArrayList<panelPrincipal2>();
		
		
		try {
			instruccion = con.createStatement();
			usuariosSet = instruccion.executeQuery(todosSql);						
			
			while(usuariosSet.next()){
				int id = usuariosSet.getInt("id");
				String nombre = usuariosSet.getString("nombre");
				String edad = Integer.toString(usuariosSet.getInt("edad"));//Convertimos de int a String
				String nacionalidad = usuariosSet.getString("nacionalidad");
			
				
				panelPrincipal2 del = new panelPrincipal2();
				
				delincuentesList.add(del);
			}
			
			instruccion.close();

			return (panelPrincipal2[]) usuarios;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
				
	}

	public Object getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}