package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 03 - Escrever um Programa para determinar o consumo m�dio de um autom�vel
	 * sendo fornecida a dist�ncia total percorrida pelo autom�vel e o total de
	 * combust�vel gasto.
	 */
	System.out.println("==============================================");
	System.out.println("          Autonomia de um Automovel");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);
	String carro, modelo;
	int ano, tanque;
	double km, consumo, media, ltgastos;

	System.out.print("Qual a marca do seu carro?: ");
	carro = sc.next();
	System.out.print("Qual o modelo do seu Carro?: ");
	modelo = sc.next();
	System.out.print("Qual o distancia percorrida em KM?: ");
	km = sc.nextDouble();
	System.out.print("Quantos litros de combustivel foi utilizado no percurso? : ");
	ltgastos = sc.nextDouble();

	media = km / ltgastos;
	System.out.println("==============================================");
	System.out.println("Seu carro esta fazendo em media " + media + " por KM rodado.");
	System.out.println("==============================================");
    }

}
