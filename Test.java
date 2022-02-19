package outro.estudo.aula11.collections;

public class Test implements Comparable<Test>{

	int tamanho;

	public Test(int s) {
		tamanho = s;
	}
	
	@Override
	public String toString() {
		return tamanho + "";
	}

	@Override
	public int compareTo(Test test) {		
		return tamanho - test.tamanho;
	}
	
	
}
