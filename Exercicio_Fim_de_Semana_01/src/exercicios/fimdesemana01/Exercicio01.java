package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*01 - Escrever um Programa que receba dois valores n�mericos e exiba o maior entre os 2 
		 * numeros, use Scanner, validar caso os numeros forem iguais tamb�m.*/
	        System.out.println("==============================================");
		System.out.println("Identificar Maior N� digitado e numeros iguais");
		System.out.println("==============================================");
	     	Scanner sc=new Scanner(System.in);
	     	int a, b;
	     	
	     	System.out.println("Digite o 1� Numero: ");
	     	a=sc.nextInt();
	     	System.out.println("Digite o 2� Numero: ");
	     	b=sc.nextInt();
	     	
	     	if(a>b) {
	     	    System.out.print("O maior numero digitado foi o 1�: " + a);
	     	}else if(b>a) {
	     	    System.out.print("O maior numero digitado foi o 2�: "+ b);
	     	}else {
	     	    System.out.println("O 1� numero e o 2� s�o iguais");
	     	}
	     	sc.close();
	     	System.out.println("==============================================");
	}

}
