package repeticao;

import java.util.Scanner;


public class IdadeAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = "";
		String idade = "0";
		
		String nomeFinal = "";
		int idadeFinal = 0;
		double soma = 0;
		int quantia = 0;
		
		do {
			if(!nome.isBlank() && !nome.isEmpty()) {
				soma += Integer.parseInt(idade);
				quantia++;
				if(Integer.parseInt(idade) > idadeFinal) {
					idadeFinal = Integer.parseInt(idade);
					nomeFinal = nome;
				}
			}
			
			System.out.print("Informe o nome do aluno: ");
			nome = scanner.nextLine();
			
			if(!nome.equalsIgnoreCase("s")) {
				System.out.print("Informe a idade do aluno: ");
				idade = scanner.nextLine();
			}
			
		}while(!nome.equalsIgnoreCase("s"));

		
		System.out.println("\nAluno com a maior idade: "+nomeFinal+" -> idade: "+idadeFinal);
		System.out.println("Soma das idades: "+soma);
		System.out.println("Média das idades: "+(soma/quantia));
		
		
	}
}
