package aluguel.veiculo;

public enum Categoria {

    BASICO(1), INTERMEDIARIO(2), EXECUTIVO(3), PREMIUM(4);

   
    Categoria(Integer i) {
  int [] cod= {1,2,3,4};
	Integer Basico = 1;
	Integer Intermediario = 2;
	Integer Executivo = 3;
	Integer Premium = 4;
	System.out.println("BASICO(1), INTERMEDIARIO(2), EXECUTIVO(3), PREMIUM(4)");
	System.out.println(cod);
	
    }
    

}
