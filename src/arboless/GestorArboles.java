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
				"------MENU-------\n" + OPCION_UNO + ". Insertar arbol\n" + OPCION_DOS + ". Eliminar arbol\n"
						+ OPCION_TRES + ". Modificar información del árbol\n"
								+ "4. Visualizar arbol\n" + SALIR + ". Salir\n" + "Elije una de las opciones"));
		//fin menú
		switch (opcion_menu) {
		
		case OPCION_UNO:
			String nombrecomun;
			String nombrecientifico;
			String habitat;
			int altura;
			String origen;
			String IDArbol;
			
			IDArbol= JOptionPane.showInputDialog(null, "Escribe la Id del arbol");
			nombrecomun = JOptionPane.showInputDialog(null, "Escribe el nombre comundel arbol");
			nombrecientifico = JOptionPane.showInputDialog(null, "Escribe el nombre cientifico del arbol");
			habitat = JOptionPane.showInputDialog(null, "Escribe el habitat de el arbol");
			altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe la altura del arbol"));
			origen = JOptionPane.showInputDialog(null, "Escribe el origen del arbol");
                Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
                Statement st = con.createStatement();
                st.execute("INSERT INTO arboles (id, nombre_comun, nombre_cientifico, habitat, altura, origen) VALUES ('" + IDArbol + "','" + nombrecomun + "', '" + nombrecientifico + "', '" + habitat + "', '" + altura + "', '" + origen + "');");
                con.close();
                System.out.println("Árbol insertado!");
           
			break;
		case OPCION_DOS:
			int id = 0;
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe la id del arbol a eliminar"));
			Connection conn = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
            Statement stt = conn.createStatement();
            stt.execute("DELATE FROM arboles  WHERE id = '"+id+" Ha sido eliminado");
            conn.close();
            System.out.println("Árbol eliminado!");
		
            break;
		case OPCION_TRES: //Modificar 
			String OpcioanesCambios;
			
			OpcioanesCambios =JOptionPane.showInputDialog(null, "----------------MODIFICAR-----------------\n ¿Que Informacion quieres modificar? \n 1. Nombre comun \n 2. Nombre cientifico \n 3. Habitat \n 4. Altura \n 6. Origen \n 7.Salir");
		do {
			
			switch (OpcioanesCambios) {
			case "1": //Cambio ID
				
				
			break;
			case "2": //Nombre comun
				
				
			break;
			case "3": // Nombre cientifico
				
				
			break;
			case"4": //Cambio Habitat
			
				
			break;
			case "5"://altura
				
			break;
			case"6": // Origen
				
			break;
			case "7": // Salir 
				JOptionPane.showMessageDialog(null, "Saliendo de modificar cambios");
				System.exit(0);
			break;
			
			}
			}while (OpcioanesCambios != "7");
				
		case OPCION_CUATRO:
			JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
			break;
			
		case SALIR:
			JOptionPane.showMessageDialog(null, "Saliendo...");
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		}
	} while (opcion_menu != SALIR);
	
			
	}
	
}





