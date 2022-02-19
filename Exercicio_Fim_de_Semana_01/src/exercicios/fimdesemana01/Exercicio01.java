package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*01 - Escrever um Programa que receba dois valores númericos e exiba o maior entre os 2 
		 * numeros, use Scanner, validar caso os numeros forem iguais também.*/
	        System.out.println("==============================================");
		System.out.println("Identificar Maior Nº digitado e numeros iguais");
		System.out.println("==============================================");
	     	Scanner sc=new Scanner(System.in);
	     	int a, b;
	     	
	     	System.out.println("Digite o 1º Numero: ");
	     	a=sc.nextInt();
	     	System.out.println("Digite o 2º Numero: ");
	     	b=sc.nextInt();
	     	
	     	if(a>b) {
	     	    System.out.print("O maior numero digitado foi o 1º: " + a);
	     	}else if(b>a) {
	     	    System.out.print("O maior numero digitado foi o 2º: "+ b);
	     	}else {
	     	    System.out.println("O 1º numero e o 2º são iguais");
	     	}
	     	sc.close();
	     	System.out.println("==============================================");
	}

}
