package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
/*02 - Escrever um Programa que receba dois valores n�mericos 
 * e ao final mostre a soma, subtra��o, multiplica��o e a divis�o dos valores lidos.*/
	System.out.println("==============================================");
	System.out.println("          Calculo com as 4 Opera��es");
	System.out.println("==============================================");
	Scanner sc=new Scanner(System.in);
     	int a, b;
     	
     	System.out.print("Digite o 1� Numero: ");
     	a=sc.nextInt();
     	System.out.print("Digite o 2� Numero: ");
     	b=sc.nextInt();
     	System.out.println("=================================================");
     	System.out.println("A soma de "+ a+" e " +b+ " �: "+ (a+b));
     	System.out.println("A subtra��o de "+ a+ " e " +b+ " �: "+ (a-b));
     	System.out.println("A Multiplica��o de "+ a+" e " +b+ " �: " + a*b);
     	System.out.println("A divis�o de "+ a+" e " +b+ " �: " + (a/b));
     	System.out.println("=================================================");
    }

}
