package locacao.veiculos;

public enum VeiculosEnum {
    FIAT_UNO(0, "Básico", "Fiat Uno", "way", "1.0", "preto", 130.00),
    VW_GOL(1, "Básico", "VW Gol", "G3", "1.0", "branco", 150.00),
    JEEP_RENEGADE(2, "Intermediário", "Jeep Renegade", "std AT", "1.8", "preto", 350.00),
    RENAULT_DUSTER(3,"Intermediário", "Renault Duster", "Dynamique", "1.6", "branco", 350.00),
    TOYOTA_HILUX(4, "Executivo", "Toyota Hilux", "SW4", "3.0", "preto", 1500.00),
    GM_TRAILBLAZER(5, "Executivo", "GM TrailBlazer", "LTZ", "3.0", "branco", 1800.00),
    PORCHE_CAYENNE(6, "Premium", "Porche Cayenne", "turbo GT", "4.0", "preto", 3500.00),
    FORD_MUSTANG(7, "Premium", "Ford Mustang", "Mach 1", "5.0", "branco", 4000.00);

    private final int id;
    private final String categoria;
    private final String veiculo;
    private final String modelo;
    private final String motor;
    private final String cor;
    private final double preco;

    VeiculosEnum(int id, String categoria, String veiculo, String modelo, String motor, String cor, double preco) {
        this.id = id;
        this.categoria = categoria;
        this.veiculo = veiculo;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public static VeiculosEnum getById(int id) {
        for(VeiculosEnum veiculo : values()) {
            if(veiculo.getId() == id)
                return veiculo;
        }
        return null;
    }

    public static VeiculosEnum fromString(String value) {
        for (VeiculosEnum veiculo : VeiculosEnum.values()) {
            if(veiculo.getVeiculo().equalsIgnoreCase(value))
                return veiculo;
        }
        return null;
    }

}
