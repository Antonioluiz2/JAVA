package locacao.veiculos;

import java.util.List;

public enum Categoria {
    BASICO(1,"Básico", VeiculosEnum.FIAT_UNO, VeiculosEnum.VW_GOL),
    INTERMEDIARIO(2,"Intermediário", VeiculosEnum.JEEP_RENEGADE, VeiculosEnum.RENAULT_DUSTER),
    EXECUTIVO(3, "Executivo", VeiculosEnum.TOYOTA_HILUX, VeiculosEnum.GM_TRAILBLAZER),
    PREMIUM(4, "Premium", VeiculosEnum.PORCHE_CAYENNE, VeiculosEnum.FORD_MUSTANG);

    private final int id;
    private final String categoriaPorExtenso;
    private final List<VeiculosEnum> veiculoEnums;

    Categoria(int id, String categoriaPorExtenso, VeiculosEnum ... veiculosEnums) {
        this.id = id;
        this.categoriaPorExtenso = categoriaPorExtenso;
        this.veiculoEnums = java.util.Arrays.asList(veiculosEnums);
    }

    public int getId() {
        return id;
    }

    public String getCategoriaPorExtenso() {
        return categoriaPorExtenso;
    }

    public List<VeiculosEnum> getVeiculoEnums() {
        return veiculoEnums;
    }

    public static Categoria getById(int id) {
        for(Categoria categoria : values()) {
            if(categoria.getId() == id)
                return categoria;
        }
        return null;
    }

    public static String fromString(String value) {
        for (Categoria categoria : Categoria.values()) {
            if(categoria.getCategoriaPorExtenso().equalsIgnoreCase(value))
                return categoria.getCategoriaPorExtenso();
        }
        return null;
    }

}
