package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 08 - Elaborar um Programa que efetue a apresenta��o do valor da convers�o em
	 * real (R$) de um valor lido em d�lar (US$). O Programa dever� solicitar o
	 * valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o
	 * usu�rio. Use o do-while.
	 */
	System.out.println("==============================================");
	System.out.println("          Convers�o Moeda");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	
	float dolar, real,cota,qtde; 
	
	while(2>1) { 
	
	System.out.print("Digite o valor em Dolar US$: ");
	dolar=sc.nextFloat();
	System.out.print("Digite a conta��o do dia?: ");
	cota=sc.nextFloat();
	System.out.println("O valor convertido em � R$ : "+dolar*cota);
	System.out.print("Digite quantos dolares voce tem disponivel: ");
	qtde=sc.nextFloat();
	System.out.println("Voce tem US$"+qtde+" que pode ser convertido em R$ "+qtde*cota);
	System.out.println("==============================================");
	}	
    }

}
