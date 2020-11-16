public class Insertion{
	//atributos
	private int[] vetorOriginal;
	private int[] vetorOrdenado;
	private int quantidadeDeTrocas;

	//recebe o vetor original e instancia os atributos
	public Insertion(int[] vet){
		//pega o tamanho do vetor
		int tam = vet.length;
		//instancia os atributos
		this.vetorOriginal = new int[tam];
		this.vetorOrdenado = new int[tam];
		this.quantidadeDeTrocas = 0;
		//aloca os valores recebido nos vetores		
		for (int i = 0; i < tam; i++) {
		 	this.vetorOriginal[i] = vet[i];
		 	this.vetorOrdenado[i] = vet[i];
		}
	}
	//Ordena o vetor
	public void insertionSort(){
		int aux = 0, j = 0;
		//inicia o index na posição 1 para poder comparar com a posição anterior
		for (int i = 1; i < vetorOriginal.length; i++) {
			aux = vetorOrdenado[i];
			j = i-1;
			//realiza a troca
			while(j >= 0 && aux < vetorOrdenado[j]){
				this.vetorOrdenado[j+1] = vetorOrdenado[j];
				j--;
				this.quantidadeDeTrocas++;
			}
			//coloca o valor que foi substituido na nova posição
			this.vetorOrdenado[j+1] = aux;
		}
	}

	//retorna o vetor original
	public int getVetorOriginal(int i){
		return vetorOriginal[i];
	}
	//retorna o vetor ordenado
	public int getVetorOrdenado(int i){
		return vetorOrdenado[i];
	}
	//retorna a quantidade de trocas
	public int getQuantidadeDeTrocas(){
		return this.quantidadeDeTrocas;
	}
	//metodo que mostra os valores de todos os atributos
	public String toString(){
		String texto = "";
		texto += "Vetor original:";
		for (int i = 0; i < vetorOriginal.length; i++ ) {
			texto += " "+this.vetorOriginal[i];			
		}
		texto += ", vetor ordenado:";
		for (int i = 0; i < vetorOrdenado.length; i++ ) {
			texto += " "+this.vetorOrdenado[i];			
		}
		texto += ", quantida de trocas: "+this.quantidadeDeTrocas;
		return texto;
	}
}