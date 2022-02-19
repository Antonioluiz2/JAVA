package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
/*02 - Escrever um Programa que receba dois valores númericos 
 * e ao final mostre a soma, subtração, multiplicação e a divisão dos valores lidos.*/
	System.out.println("==============================================");
	System.out.println("          Calculo com as 4 Operações");
	System.out.println("==============================================");
	Scanner sc=new Scanner(System.in);
     	int a, b;
     	
     	System.out.print("Digite o 1º Numero: ");
     	a=sc.nextInt();
     	System.out.print("Digite o 2º Numero: ");
     	b=sc.nextInt();
     	System.out.println("=================================================");
     	System.out.println("A soma de "+ a+" e " +b+ " é: "+ (a+b));
     	System.out.println("A subtração de "+ a+ " e " +b+ " é: "+ (a-b));
     	System.out.println("A Multiplicação de "+ a+" e " +b+ " é: " + a*b);
     	System.out.println("A divisão de "+ a+" e " +b+ " é: " + (a/b));
     	System.out.println("=================================================");
    }

}
