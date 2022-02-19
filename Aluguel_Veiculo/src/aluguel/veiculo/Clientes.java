package aluguel.veiculo;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Clientes {
    
    
    private Integer id;
    private String nome;
    private Integer idade;
    private Integer soma;
    private String marca;
    //List<Clientes> clientes= Arrays.asList(new Clientes());
    Map<String, Integer>cliente=new HashMap<>();
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public Integer getId() {
	
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
	/*int i = 1;
	int qtdDias, soma;
	
	Scanner cd = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	nome = cd.next();
	System.out.println("Em quantos dias de aluguel? ");
	qtdDias = cd.nextInt();

	
	do {

	    System.out.println("Digite os quilometros corridos no dia " + i + " ?");
	    kmp = cd.nextDouble();

	    System.out.println("Mandou bem! Continue a correr!");
	    System.out.println("Deseja continuar? (S) sim / (N) Não");
	    escolha = cd.next();

	    total = total + kmp;
	    if (total >= meta) {
		System.out.println(nome);
		System.out.println("Voce ja atingil a meta, Total acumulado: " + total + "KM em " + i + " dias");
		System.out.println("Parabens Meta Alcançada com sucesso!!!");
		System.out.println("============================================");
		System.out.println("Fim do Programa!");
		System.out.println("============================================");
		break;
	    }

	    if (escolha.equals("S") && total < meta) {
		System.out.println(nome);
		System.out
			.println("Voce percorreu neste dia " + kmp + " Saldo ja percorrido " + total + " KM no total");
	    } else {
		System.out.println("============================================");
		System.out.println("Voce escolheu Sair!");
		System.out.println("Fim do Programa!");
		System.out.println("============================================");
		break;
	    }

	    i++;

	} while (i < qtdDias);*/

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
    public Integer getSoma() {
	
        return soma;
    }

    public void setSoma(Integer soma) {
        this.soma = soma;
    }

  
    
}
