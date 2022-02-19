package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 07 - Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
	 * Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura
	 * em Fahrenheit e C a temperatura em Celsius. Use o While para o Exercicio
	 */
	System.out.println("==============================================");
	System.out.println("          Conversão Temperatura");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	
	double Celsius, Fahrenheit; 
	while(2>1) {
	System.out.print("Digite a temperatura em Celsius: ");
	Celsius = sc.nextDouble();
	
	
	    
	
	Fahrenheit = ( 9 * Celsius + 160 ) / 5;
        System.out.println("O temperatura digitada é: C"+ Celsius);
	System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
	System.out.println("==============================================");
	}
    }

}
