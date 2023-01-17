package arboless;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main_Arboles {
	public static void main(String[] args) throws HeadlessException, ParseException, FileNotFoundException {
		GestorArboles gf = new GestorArboles();
		gf.run();
	}
}
