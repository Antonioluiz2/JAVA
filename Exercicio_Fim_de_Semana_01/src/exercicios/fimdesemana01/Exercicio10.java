package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 10 - A Loja Quitanda do seu Jo�o mercado pequeno est� vendendo seus produtos
	 * em at� 5 (cinco) presta��es sem juros. Fa�a um Programa que receba cadastros
	 * de clientes(codigo,nome, sobrenome, ), um valor de uma compra e escolha em
	 * at� quantas presta��es deve fazer e mostre o valor das presta��es, exemplo o
	 * total deu 500,00 se o cliente solicitar fazer em 4 vezes o valor da presta��o
	 * deve ser 125,00, se for em 5 vezes 105,00 (mais acrescimo de 5% do total da
	 * compra) se o funcionario quiser fazer em 6 vezes deve informar que a op��o
	 * esta invalida, somente em at� 5 vezes a compra deve ser parcelada. No final
	 * pegar um cliente do array e mostrar o nome, sobrenome e o valor da parcela da
	 * compra realizada. �N�o usar orienta��o Objeto� pode ser( While, for,
	 * if-else,switch, array)
	 */
	System.out.println("==============================================");
	System.out.println("          Loja Quitanda");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	String[] nome = new String[5];
	String []sobrenome= new String [5];
	int[] codigo = new int[5];
	int valorCompra, prest;
	double parcela=0.0;

	for(int i=0;i<5;i++) {
	System.out.println("Nome Cliente: ");
	nome[i] = sc.nextLine();
	System.out.println("Sobre Nome Cliente: ");
	sobrenome[i] = sc.nextLine();
	System.out.println("Valor da compra: ");
	valorCompra=sc.nextInt();
	System.out.println("Quantas vezes deseja pagar: ");
	prest=sc.nextInt();
	
	  if(prest<=5){
	      parcela=(5 * valorCompra / 100)+valorCompra/prest;
		System.out.println("O valor da parcela fica: "+ parcela);
		
	  }else {
	      System.out.println("Op��o Ivalida!");
	      
	  }
	  
	  System.out.println("==============================================");
		//System.out.println(nome[5]);
		System.out.println(nome[i]+" "+sobrenome[i]+" valor da parcela: "+ parcela);
	}
	sc.nextLine();
	

    }

}
