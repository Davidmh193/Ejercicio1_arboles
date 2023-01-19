package arboless;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class GestorArboles {
	private static final String HOST = "localhost";
	private static final String BBDD = "eh_garden";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	public void run() throws FileNotFoundException, SQLException, ClassNotFoundException{
    
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
		
	final int OPCION_UNO = 1;
	final int OPCION_DOS = 2;
	final int OPCION_TRES = 3;
	final int OPCION_CUATRO=4;
	final int SALIR = 0;
	int opcion_menu;
	
	
	
	do {
		opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
				"------MENU-------\n" + OPCION_UNO + ". insertar arbol\n" + OPCION_DOS + ". eliminar arbol\n"
						+ OPCION_TRES + ". modificar información del árbol\n"
								+ "4. visualizar arbol\n" + SALIR + ". Salir\n" + "Elije una de las opciones"));
		//fin menú
		switch (opcion_menu) {
		
		case OPCION_UNO:
			String nombrecomun;
			String nombrecientifico;
			String habitat;
			int altura;
			String origen;
	
			nombrecomun = JOptionPane.showInputDialog(null, "escribe el nombre comundel arbol");
			nombrecientifico = JOptionPane.showInputDialog(null, "Escribe el nombre cientifico del arbol");
			habitat = JOptionPane.showInputDialog(null, "Escribe el avitat de el arbol");
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe la altura del arbol"));
			origen = JOptionPane.showInputDialog(null, "Escribe el origen del arbol");
                Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
                Statement st = con.createStatement();
                st.execute("INSERT INTO arboles (nombre_comun, nombre_cientifico, habitat, altura, origen) VALUES ('" + nombrecomun + "', '" + nombrecientifico + "', '" + habitat + "', '" + altura + "', '" + origen + "');");
                con.close();
                System.out.println("Árbol insertado!");
           
			break;
		case OPCION_DOS:
			int id = 0;
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe la id del arbol a eliminar"));
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
            Statement stt = conn.createStatement();
            stt.execute("DELATE FROM arboles  WHERE id = '"+id+"Ha sido eliminado");
            conn.close();
            System.out.println("Árbol eliminado!");
		
            break;
		case OPCION_TRES:
			JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
			break;
		case OPCION_CUATRO:
			JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
			break;
		case SALIR:
			JOptionPane.showMessageDialog(null, "Adios");
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		}
	} while (opcion_menu != SALIR);
	
			
	}
	
}




