package arboless;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main_Arboles {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
		GestorArboles gf = new GestorArboles();
		gf.run();
	}
}
