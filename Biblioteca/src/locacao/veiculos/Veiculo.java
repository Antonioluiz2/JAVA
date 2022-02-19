package locacao.veiculos;

public class Veiculo {
    private final String marcaModelo;
    private final String modeloComplemento;
    private final String categoria;
    private final String motor;
    private final double preco;
    private Integer diarias;

    public Veiculo(int numeroCategoria, String nomeVeiculo) {
	Categoria categoriaVeiculoEnum = Categoria.getById(numeroCategoria);
	VeiculosEnum veiculoEnum = VeiculosEnum.fromString(nomeVeiculo);
	if (veiculoEnum.getCategoria().equalsIgnoreCase(categoriaVeiculoEnum.getCategoriaPorExtenso())) {
	    this.marcaModelo = veiculoEnum.getVeiculo();
	    this.modeloComplemento = veiculoEnum.getModelo();
	    this.categoria = veiculoEnum.getCategoria();
	    this.motor = veiculoEnum.getMotor();
	    this.preco = veiculoEnum.getPreco();
	} else {
	    
	    System.out.println("========================================");
	    System.out.println("           Tente novamente              ");
	    System.out.println("========================================");
	    throw new IllegalArgumentException("Opção Invalida!!");
	}
    }

    public String getMarcaModelo() {
	return marcaModelo;
    }

    public String getModeloComplemento() {
	return modeloComplemento;
    }

    public String getCategoria() {
	return categoria;
    }

    public double getPreco() {
	return preco;
    }

    public String getMotor() {
	return motor;
    }

    public Integer getDiarias() {
	return diarias;
    }

    public void setDiarias(Integer diarias) {
	this.diarias = diarias;
    }

    @Override
    public String toString() {
	return "categoria " + categoria + " " + marcaModelo + " - modelo " + modeloComplemento + " - motor " + motor
		+ " valor diária R$ " + preco + " por " + diarias + " dias";
    }

}
