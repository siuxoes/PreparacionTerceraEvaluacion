package Recuperacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictado {

	public static void main(String args[]) throws Exception {
		String texto = "";
		try {
			BufferedReader lector = new BufferedReader(
					new FileReader("dictado"));
			String s;
			
			Map<String, Integer> map1 = new HashMap<String, Integer>();
			for (char i = 'A'; i <= 'Z'; i++) {
				map1.put("" + i, 0);
			}
			while ((s = lector.readLine()) != null) {
				texto+=s;
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) != ' ') {
						map1.put("" + s.charAt(i),
								map1.get("" + s.charAt(i)) + 1);
					}
				}

			}
			for (char i = 'A'; i <= 'Z'; i++) {
				System.out.println("" + i + " " + map1.get("" + i));

			}
			lector.close();
		} catch (FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado");
		} catch (IOException ioex) {
		}
		System.out.println("Contenido del fichero es: " + texto);

	}

}
