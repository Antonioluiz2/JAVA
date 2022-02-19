package locacao.veiculos;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Locacao {
    private final List<Cliente> clientes = new ArrayList<>();

    public void alugaVeiculos(Map<Integer, Veiculo> veiculos, Cliente cliente) {
        for (Map.Entry<Integer, Veiculo> veiculo : veiculos.entrySet()) {
            cliente.addVeiculos(veiculo.getValue(), (veiculo.getValue().getPreco() * veiculo.getKey()));
            cliente.setFaturaTotal(cliente.getFaturaTotal() + (veiculo.getValue().getPreco() * veiculo.getKey()));
        }
    }

    public void confirmaLocacao(Cliente cliente) {
        clientes.add(cliente);
    }

    public void exibePrecosVeiculosPorCategoria() {

        Categoria[] categorias = Categoria.values();

        System.out.println("--- TABELA DE PREÇOS ---");
        for (Categoria categoria : categorias) {
            System.out.print(categoria.getId());
            System.out.print(" - " + categoria.name() + "\n");
            for (VeiculosEnum veiculo : categoria.getVeiculoEnums()) {
                System.out.print(" " + veiculo.getVeiculo());
                System.out.print(" - Modelo " + veiculo.getModelo());
                System.out.print(" - motor " + veiculo.getMotor());
                System.out.printf(" - R$ %.2f\n", veiculo.getPreco());
            }

        }

    }

    public void exibeVeiculosAlugadosPorTodosOsClientes() {

        for (Cliente cliente : clientes) {

           System.out.println("\nNome do(a) cliente: " + cliente.getNome());
           System.out.println("Idade: " + cliente.getIdade());
           for (Veiculo veiculo : cliente.getVeiculos().keySet()) {
               System.out.println(veiculo);
           }
           System.out.print("Total da fatura do(a) cliente " + cliente.getNome());
           System.out.printf(" R$ %.2f", cliente.getFaturaTotal());
        }

    }

    public void getClienteById(int id) {
        System.out.println("\nImprimindo o cliente armazenado com o Id: " + id);
        Cliente cliente;
        for (Cliente x : clientes) {
            if (x.getId().equals(id)) {
                cliente = x;
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Idade: " + cliente.getIdade());

                System.out.print("\nResumo das contratações: ");
                for (Veiculo veiculo : cliente.getVeiculos().keySet()) {
                    System.out.print("\nAlugou por " + veiculo.getDiarias() + " dias na cat. " + veiculo.getCategoria() +
                            " " + veiculo.getMarcaModelo() + " modelo " + veiculo.getModeloComplemento() + "," +
                            " motor " + veiculo.getMotor() + " com valor: R$ " + cliente.getVeiculos().get(veiculo));
                }
                System.out.println("\nValor total do aluguel de "+ cliente.getNome() +": R$ "+ cliente.getFaturaTotal());
            }
        }
    }


}
