package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 08 - Elaborar um Programa que efetue a apresentação do valor da conversão em
	 * real (R$) de um valor lido em dólar (US$). O Programa deverá solicitar o
	 * valor da cotação do dólar e também a quantidade de dólares disponíveis com o
	 * usuário. Use o do-while.
	 */
	System.out.println("==============================================");
	System.out.println("          Conversão Moeda");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	
	float dolar, real,cota,qtde; 
	
	while(2>1) { 
	
	System.out.print("Digite o valor em Dolar US$: ");
	dolar=sc.nextFloat();
	System.out.print("Digite a contação do dia?: ");
	cota=sc.nextFloat();
	System.out.println("O valor convertido em é R$ : "+dolar*cota);
	System.out.print("Digite quantos dolares voce tem disponivel: ");
	qtde=sc.nextFloat();
	System.out.println("Voce tem US$"+qtde+" que pode ser convertido em R$ "+qtde*cota);
	System.out.println("==============================================");
	}	
    }

}
