package exercicios.fimdesemana01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*
	 * 05 - Escrever um Programa que leia 10 alunos nome e matricula do aluno e as
	 * notas das 4 provas que ele obteve no semestre. No final informar matricula,o
	 * nome do aluno da media (PASSOU, REPROVADO) mais alta e matricula,o nome do
	 * aluno da media (PASSOU, REPROVADO) mais baixa da lista cadastrada.Calculo da
	 * média (aritmética) e informar se ele passou(media >=7), ficou de
	 * recuperação(media >=4 ou < 7) ou reprovou (media < 4),
	 */
	System.out.println("==============================================");
	System.out.println("          Condição Aluno");
	System.out.println("==============================================");
	Scanner sc = new Scanner(System.in);

	String nome;
	Double media, med,soma=0.0;
	int matr;

	String[] aluno = new String[10];
	int[] mat = new int[10];
	Double[] nota = new Double[4];

	/*
	 * for (int i = 0; i < aluno.length; i++) { System.out.println("inicio: ");
	 */
	
	for (int i = 0; i < aluno.length; i++) {
	    System.out.print("Digite o nome do aluno: ");
	    aluno[i] = sc.nextLine();

	    for (int j = 0; j < 1; j++) {
		System.out.print("Digite a Matricula do Aluno: ");
		mat[i] = sc.nextInt();
	    }
	    	for (Double n = 0.0; n < nota.length; n++) {
		    System.out.print("Digite a Nota das provas 1-4: ");
		    nota[i] = sc.nextDouble();
		    soma+= nota[i].intValue();
		    sc.nextLine();
		
	    	}
	    
	    System.out.println("---------------------------------------------");
	    
	    media = (soma/4);
	    //med = media /4;
	    		   
	    System.out.println("A media do Aluno " + aluno[i] + " Foi: " + media);
	    if (media >= 7) {
		System.out.println("Aluno " + aluno[i] + "  foi Aprovado");
	    } else if (media >= 5 && media < 7) {
		System.out.println("O Aluno " + aluno[i] + "vai para Recuperação");
	    } else {
		System.out.println("O Aluno " + aluno[i] + " foi Reprovado");
	    }
	    System.out.println("==============================================");
	    

	        }
	    	
	/*for(int m=0; m < aluno.length; m++){ 
	   
	    if(aluno [m].getnota()>nota.length) {// && aluno[m].getNota<aluno[m]){//notaMaior=alunos[m]{
		System.out.println("O Aluno com maior nota é: ");
	    
	    }
	}*/
    
	}

}
