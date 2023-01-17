package arboless;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class GestorArboles {

	public void run() throws FileNotFoundException {
		
	private static final String Host = "localhost";
	private static final String BBDD = "eh_garden ";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
		
	public static void main (String[] args) {
	Scanner scan =new Scanner(System.in);
			
			try {
		
		
		
		
		
		
		
		
		
		
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
			JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
			break;
		case OPCION_DOS:
			JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
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




