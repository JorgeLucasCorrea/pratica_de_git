package ifsc;

/**
 * 
 * @author Jorge Lucas Corrêa
 *@date 30/09/2022
 *@version 1.0
 *
 */

public class MainGit {

	public static void main(String[] args) {
		

	}
	
	/**
	 * Pega um vetor e retorna o valor dobrado em double
	 * 
	 * @param vetor
	 * @return
	 */

	public Double[] multiplicaVetor(Double[] vetor) {
		Double[] novoVetor = new Double[vetor.length];
		for (int i = 0; i < novoVetor.length; i++) {
			novoVetor[i] = vetor[i] * vetor[i];
		}
		
		return novoVetor;
	}
	
}
