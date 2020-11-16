public class Bubble{
	//atributos
	private int[] vetorOriginal;
	private int[] vetorOrdenado;
	private int quantidadeDeTrocas;

	//recebe o vetor original e instancia os atributos
	public Bubble(int[] vet){
		//instancia os vetores a partir do tamanho do vetor passado pelo parametro
		this.vetorOriginal = new int[vet.length];
		this.vetorOrdenado = new int[vet.length];
		this.quantidadeDeTrocas = 0;		
		for (int i = 0; i < vet.length; i++) {
		 	this.vetorOriginal[i] = vet[i];
		 	this.vetorOrdenado[i] = vet[i];
		}
	}
	//Ordena o vetor
	public void bubbleSort(){
		int aux;
		//percorre o indice i
		for (int i = 0; i < vetorOrdenado.length-1; i++){
			//percorre o indice j
			for (int j = i+1; j < vetorOrdenado.length; j++) {
				//verifica se o valor em "i" é maior que na pos "j"
				if (vetorOrdenado[i] > vetorOrdenado[j]) {
					//troca
					aux = vetorOrdenado[j];
					this.vetorOrdenado[j] = vetorOrdenado[i];
					this.vetorOrdenado[i] = aux;
					//conta numero de trocas
					this.quantidadeDeTrocas++;
				}				
			}
			
		}
	}

	//retorna o vetor original
	public int getVetorOriginal(int i){
		return vetorOriginal[i];
	}
	//retorna o vetor ordenado
	public int getVetorOrdenado(int i){
		return this.vetorOrdenado[i];
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