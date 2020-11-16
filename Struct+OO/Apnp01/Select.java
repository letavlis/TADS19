public class Select{
	//atributos
	private int[] vetorOriginal;
	private int[] vetorOrdenado;
	private int quantidadeDeTrocas;

	//recebe o vetor original e instancia os atributos
	public Select(int[] vet){
		this.vetorOriginal = new int[vet.length];
		this.vetorOrdenado = new int[vet.length];
		this.quantidadeDeTrocas = 0;		
		for (int i = 0; i < vet.length; i++) {
		 	this.vetorOriginal[i] = vet[i];
		 	this.vetorOrdenado[i] = vet[i];
		}
	}
	//Ordena o vetor
	public void selectSort(){
		int i, aux, j, a=0;

		while(a < vetorOriginal.length){
			//inicia o j a partidar do indice "a"
			j = a;
			for (i = a+1; i < vetorOrdenado.length; i++){
				if(vetorOrdenado[j] > vetorOrdenado[i]){
					//troca o valor de j pelo valor de onde se encontra o menor valor
					j = i;
				}				
			}
			//verifica se o j mudou de valor para efetuar a troca
			if (j != a) {
				//faz a troca
				aux = vetorOrdenado[a];
				this.vetorOrdenado[a] = vetorOrdenado[j];
				this.vetorOrdenado[j] = aux;
				//soma a quantidade de trocas
				this.quantidadeDeTrocas++;
			}
			a++;
		}
	}

	//retorna o vetor original
	public int getVetorOriginal(int i){
		return this.vetorOriginal[i];
	}
	//retorna o vetor ordenado
	public int getVetorOrdenado(int i){
		return this.vetorOrdenado[i];
	}
	//retorna a quantidade de trocas
	public int getQuantidadeDeTrocas(){
		return quantidadeDeTrocas;
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