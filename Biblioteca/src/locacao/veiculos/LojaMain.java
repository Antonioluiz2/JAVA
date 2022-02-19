package locacao.veiculos;
import java.util.*;

public class LojaMain {

    	 static int idCliente = 0;

	    public static Integer geraIdCliente() {
	        return ++idCliente;
	    }

	    public static void main(String[] args) {

	        Locacao locadora = new Locacao();

	        Scanner texto = new Scanner(System.in);
	        Scanner numero = new Scanner(System.in);

	        String controleVeiculos = "s";
	        String controleClientes = "s";
	        System.out.println("========================================");
		System.out.println("      Programa Aluguel de Veiculos      ");
		System.out.println("========================================");

	        do {
	            System.out.println("Digite o nome do cliente: ");
	            String nome = texto.nextLine();
	            System.out.println("Digite a idade do cliente: ");
	            Integer idade = numero.nextInt();
	            Cliente cliente = new Cliente(geraIdCliente(), nome, idade);

	            do {

	                locadora.exibePrecosVeiculosPorCategoria();

	                System.out.println("\nDigite o n�mero da categoria do ve�culo que deseja alugar: ");
	                int numeroCategoria = numero.nextInt();

	                while(numeroCategoria < 1 || numeroCategoria > 4) {
	                    System.out.println("Categoria inv�lida!");
	                    System.out.println("Digite o n�mero da categoria do ve�culo que deseja alugar: ");
	                    numeroCategoria = numero.nextInt();
	                }

	                System.out.println("Digite quantos ve�culos desta categoria deseja alugar: ");
	                int qtdVeiculos = numero.nextInt();

	                while(qtdVeiculos < 1) {
	                    System.out.println("Quantidade inv�lida!");
	                    System.out.println("Digite quantos ve�culos desta categoria deseja alugar: ");
	                    qtdVeiculos = numero.nextInt();
	                }

	                Map<Integer, Veiculo> veiculos = new HashMap<>();

	                Veiculo veiculo;
	                for (int i = 1; i <= qtdVeiculos; i++) {
	                    veiculo = null;
	                    System.out.println("Digite o nome do " +i+" � ve�culo que deseja alugar:\nExemplo: Fiat uno");
	                    String nomeVeiculo = texto.nextLine();
	                  
	                    while(veiculo == null) {
	                	
	                        try {
	                            veiculo = new Veiculo(numeroCategoria, nomeVeiculo);
	                        } catch (IllegalArgumentException e) {
	                        System.out.println("Op��o Invalida!");
	            		System.out.println(e.getMessage());
	            		System.out.println("========================================");
	            		System.out.println("           Tente novamente              ");
	            		System.out.println("========================================");
	                        }
	                    }

	                    System.out.println("Digite o numero de dias que deseja alugar o ve�culo " + veiculo.getMarcaModelo());
	                    Integer dias = numero.nextInt();
	                    veiculo.setDiarias(dias);
	                    System.out.println("Total a ser pago pelo aluguel do ve�culo "+ veiculo.getMarcaModelo() +
	                            ": R$ "+ (veiculo.getPreco() * veiculo.getDiarias()));
	                    veiculos.put(dias, veiculo);
	                }

	                locadora.alugaVeiculos(veiculos, cliente);
	                System.out.print("Deseja alugar outro ve�culo? Digite [S]=SIM ou [N]=N�O");
	                controleVeiculos = texto.nextLine();

	            } while (controleVeiculos.equalsIgnoreCase("s"));

	            locadora.confirmaLocacao(cliente);

	            System.out.print("Deseja cadastrar outro cliente? Digite [S]=SIM ou [N]=N�O");
	            controleClientes = texto.nextLine();

	        } while (controleClientes.equalsIgnoreCase("s"));

	        do {
	            System.out.println("Digite o id do cliente a ser pesquisado: ");
	            int idCliente = numero.nextInt();
	            locadora.getClienteById(idCliente);

	            System.out.println("Deseja pesquisar outro cliente? Digite [S]=SIM ou [N]=N�O");
	            controleClientes = texto.nextLine();
	        } while (controleClientes.equalsIgnoreCase("s"));

	        locadora.exibeVeiculosAlugadosPorTodosOsClientes();
	        System.out.println("========================================");
		System.out.println("           FIM DO PROGRAMA              ");
		System.out.println("========================================");

	    }

    }


