package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lemario {

	public static void main(String[] args) throws IOException {
		
		List<String> lemario;
		
		lemario = Files.readAllLines(
					Paths.get("resources", "lemario-general-del-espanol.txt"));
		
		//1.Show in console all words starting by letters
		// 	from a to m.

	}

}
