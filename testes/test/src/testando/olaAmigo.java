package testando;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class olaAmigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrar = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Aluno: "); 
                String nome = entrar.nextLine();
            System.out.println("Digite a Nota: ");
                float nota= entrar.nextFloat();
            System.out.println("Digite a Idade: ");
                int idade= entrar.nextInt();
       //Scanner 
       //System.out.format("Seu nome � "+ nome, nota, idade);
       System.out.println("Seu nome � :" + nome);
       System.out.println("Sua nota � :" + nota);
       System.out.println("Sua Idade � :" + idade);
       System.out.println("============================");
       LocalTime horaAtual =LocalTime.now();
       System.out.println( horaAtual);
       LocalDate dataAtual =LocalDate.now();
       System.out.println(dataAtual);
       entrar.close();
        
}
	}


