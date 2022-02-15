package testando;
import java.File;
import java.io.*;
public class File {

	public File(String string) throws IOException {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
	boolean arquivoAtual=false;
	
	File file=new File("file1.txt");
	
	//System.out.println(file1.exists());
	arquivoAtual=file.createNewFile();
	System.out.println(arquivoAtual);
	

	}

	private boolean createNewFile() {
		// TODO Auto-generated method stub
		return false;
		
	}

	
}
