package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 09 - Faça um Programa que receba um valor que foi depositado e exiba o valor
	 * com rendimento após um mês. Considere fixo o juro da poupança em 0,70% a. a.
	 */
	System.out.println("==============================================");
	System.out.println("          Rendimento Poupança");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	
	double deposito, rend,fixo; 
	System.out.println("Digite o valor de deposito: ");
	deposito=sc.nextDouble();
	System.out.println("Após um mês o rendimento é: " +0.05*deposito);
	System.out.println("==============================================");
	
    }

}
