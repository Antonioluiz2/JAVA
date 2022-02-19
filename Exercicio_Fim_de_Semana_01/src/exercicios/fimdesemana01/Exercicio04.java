package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 04 - Escrever um Programa que leia o nome de um vendedor, o seu salário fixo
	 * e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
	 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
	 * nome, o salário fixo e salário no final do mês
	 */
	System.out.println("==============================================");
	System.out.println("          Folha Pagamento - Comissão");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);
	String nome;
	double sal = 0, saltotal, comssao;
	int venda;

	System.out.print("Nome do vendedor: ");
	nome = sc.next();
	System.out.print("Digite o salario fixo do vendedor:  R$");
	sal = sc.nextDouble();
	System.out.print("Quantas vendas realizadas no mês: ");
	venda = sc.nextInt();
	comssao = 15 * sal / 100;
	saltotal = sal + comssao;
	System.out.println("==============================================");
	System.out.println("Vendedor: " + nome);
	System.out.println("Salario fixo: R$" + sal);
	System.out.println("Vendas feitas: " + venda);
	System.out.println("Valor comissão: R$" + comssao);
	System.out.println("Salario Final: R$" + saltotal);
	System.out.println("==============================================");

    }

}
