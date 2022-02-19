package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 06 - Escrever um Programa que vc informa o valor a ser gasto dentro de um
	 * supermercado, depois que leia valores dos produtos, o programa deve ir
	 * decrementando o valor saldo até não ter mais a possibilidade de compra, isso
	 * pode ser saindo do programa ou até não ter mais dinheiro suficiente para
	 * compra - mostrar o valor total e troco(resto do dinheiro), usar o While e
	 * outros operadores que achar necessario.
	 */
	System.out.println("==============================================");
	System.out.println("          Gasto Supermercado");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	String compra;
	Double saldo = 0.0, troco = 0.0, valor1;
	int matr;

	String produto[] = { "Gas","arroz","oleo","proteina","limpeza" };
	Double valorProduto[] = {100.0,4.5,9.5,21.0,70.5};
System.out.println(valorProduto[0]);
	
	System.out.println("Informe o seu saldo: ");
	saldo = sc.nextDouble();
	
		
	for (int i = 0; i < produto.length; i++) {
	    System.out.println("[]"+valorProduto[i]+produto[i]);
	  		
		
	    if (troco >= 2 ) {
		System.out.print("Escolha um produto: ");
		valor1 = sc.nextDouble();
		
	    System.out.print("Informe o valor do produto: ");
		valorProduto[i] = sc.nextDouble();
		troco = saldo- valorProduto[i] ;
		
		System.out.println("Seu troco é: " + troco);
		System.out.println("Ainda pode comprar!");
		

	    } else if(i%troco<valorProduto[i] ){
		System.out.println("Seu saldo é: " + troco + "vc não pode mais comprar");
	    }
	    
	    sc.nextLine();

	}
	//sc.close();
	/*
	 * for(String num:produto) { System.out.println(num); }
	 */

    }

}
