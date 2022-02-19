package aluguel.veiculo;

//import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class AluguelMain {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Veiculo veiculo = new Veiculo();
	// List<String>nomes=new ArrayList<>([]);
	// List<Integer>id=new ArrayList<>();
	// List<Integer>idade=new ArrayList<>();
	int line = 1;
	String[][] nome = new String[line][];
	int[][] id = new int[line][];
	int[][] idade = new int[line][];

	int count = 0;

	veiculo.Cabecalho();
	System.out.println("Escolha uma Categoria ");
	veiculo.Category();
	
	System.out.println("    ");
	System.out.print("Digite o numero da Categoria: ");
	int option = sc.nextInt();

	if (option == 1) {
	    System.out.println("    ");
	    System.out.println("Voce escolheu: {Modelo Basicos} ");
	    System.out.println("    ");
	    veiculo.setBasico("", 0);
	    System.out.print("Escolha uma Marca e Modelo: ");
	    System.out.println("[1]=FIAT_UNO \n[2]=VW_GOL");
	    int optionb = sc.nextInt();
	    if (optionb == 1) {
		System.out.println("Voce escolheu FIAT_UNO");
		veiculo.MarcFiat();

	    } else if (optionb == 2) {
		System.out.println("Voce escolheu VW_GOL");
		veiculo.MarcVw();
	    } else {
		System.out.println("Opção Invalida!");
		System.out.println("========================================");
		System.out.println("           Tente novamente              ");
		System.out.println("========================================");
	    }
	    // veiculo.marcaBasica();

	} else if (option == 2) {
	    System.out.println("    ");
	    System.out.println("Voce escolheu: {Modelo Intermediarios} ");
	    System.out.println("    ");
	    veiculo.setIntermediario("", 0);
	    System.out.println("Escolha uma Marca e Modelo: ");
	    System.out.println("[1]=JEEP_Renagade \n[2]=Renault Duster");
	    int optioni = sc.nextInt();
	    if (optioni == 1) {
		System.out.println("Voce escolheu JEEP_Renagade");
		veiculo.MarcJeep();

	    } else if (optioni == 2) {
		System.out.println("    ");
		System.out.println("Voce escolheu Renault Duster");
		System.out.println("    ");
		veiculo.MarcRenault();
	    } else {
		System.out.println("Opção Invalida!");
		System.out.println("========================================");
		System.out.println("           Tente novamente              ");
		System.out.println("========================================");
	    }
	} else if (option == 3) {
	    System.out.println("    ");
	    System.out.println("Voce escolheu: {Modelo Executivos} ");
	    System.out.println("    ");
	    veiculo.setExecutivo("", 0);
	    System.out.println("Escolha uma Marca e Modelo: ");
	    System.out.println("[1]=Toyota_Hilux \n[2]=GM_TrailBlazer");
	    int optione = sc.nextInt();
	    if (optione == 1) {
		System.out.println("Voce escolheu Toyota_Hilux");
		veiculo.MarcJeep();

	    } else if (optione == 2) {
		System.out.println("Voce escolheu GM_TrailBlazer");
		veiculo.MarcRenault();
	    } else {
		System.out.println("Opção Invalida!");
		System.out.println("========================================");
		System.out.println("           Tente novamente              ");
		System.out.println("========================================");
	    }
	} else if (option == 4) {
	    System.out.println("    ");
	    System.out.println("Voce escolheu: {Modelo Premium} ");
	    System.out.println("    ");
	    veiculo.setPremium("", 0);
	    System.out.println("Escolha uma Marca e Modelo: ");
	    System.out.println("[1]=Porche_Cayenne \n[2]=Ford_Mustang");
	    int optione = sc.nextInt();
	    if (optione == 1) {
		System.out.println("    ");
		System.out.println("Voce escolheu Porche_Cayenne");
		veiculo.MarcJeep();

	    } else if (optione == 2) {
		System.out.println("Voce escolheu Ford_Mustang");
		System.out.println("    ");
		veiculo.MarcRenault();
	    } else {
		System.out.println("Opção Invalida!");
		System.out.println("========================================");
		System.out.println("           Tente novamente              ");
		System.out.println("========================================");
	    }
	} else {
	    System.out.println("Opção Invalida");
	}
	for (int i = 0; i < nome.length; i++) {
	
	    System.out.println("Digite seu nome: ");
	    nome[i][0] = sc.nextLine();
	    System.out.println("Digite o ID: ");
	    id[count][0] = sc.nextInt();
	    System.out.println("Digite a idade: ");
	    idade[count][i] = sc.nextInt();
	    

	}
	System.out.println(nome[0][0]+""+id[0]+""+idade[0]);
	veiculo.End();
	System.out.println("=================================================================================");
    }

    // veiculo.setCat();

    // veiculo.modelo();

}
