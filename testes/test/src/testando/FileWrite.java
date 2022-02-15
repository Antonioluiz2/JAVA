package testando;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		String texto= "Meu Texto";
		try {
			File dir=new File("dir");
			dir.mkdir();
			File dir=new File(dir, "meuArquivo.txt");
			file.createNewFile();
			
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write(texto);
			fileWriter.flush();
		}
		//criar arquivo
		Files.readAllLines(Paths.get("arquivo.txt")) .forEach(System.out::println);


	}

}
