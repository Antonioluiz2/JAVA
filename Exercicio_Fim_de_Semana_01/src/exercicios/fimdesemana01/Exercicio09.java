package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 09 - Fa�a um Programa que receba um valor que foi depositado e exiba o valor
	 * com rendimento ap�s um m�s. Considere fixo o juro da poupan�a em 0,70% a. a.
	 */
	System.out.println("==============================================");
	System.out.println("          Rendimento Poupan�a");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	
	double deposito, rend,fixo; 
	System.out.println("Digite o valor de deposito: ");
	deposito=sc.nextDouble();
	System.out.println("Ap�s um m�s o rendimento �: " +0.05*deposito);
	System.out.println("==============================================");
	
    }

}
