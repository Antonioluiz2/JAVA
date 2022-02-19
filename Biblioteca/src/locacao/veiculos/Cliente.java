package locacao.veiculos;
import java.util.*;

public class Cliente {
    

        private final Integer id;
        private String nome;
        private Integer idade;
        private final Map<Veiculo, Double> veiculos;
        private Double faturaTotal;

        public Cliente(Integer id, String nome, Integer idade) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.veiculos = new HashMap<>();
            this.faturaTotal = 0.0;
        }

        public Integer getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public Map<Veiculo, Double> getVeiculos() {
            return veiculos;
        }

        public void addVeiculos(Veiculo veiculo, Double valorDiarias) {
            veiculos.put(veiculo, valorDiarias);
        }

        public Double getFaturaTotal() {
            return faturaTotal;
        }

        public void setFaturaTotal(Double faturaTotal) {
            this.faturaTotal = faturaTotal;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", veiculos=" + veiculos +
                    ", valor: R$" + faturaTotal +
                    '}';
        }
    }

