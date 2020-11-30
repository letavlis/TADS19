public class Lista{
	private Nodo prim;

	public void criaLista(){
		prim = null;
	}
	public void addInicio(int i){
		Nodo novo = new Nodo();//Alocar memoria para nó
		novo.setInfo(i);//Define novo valor
		novo.setProx(prim);//Apont para o que ja existe
		prim = novo;//define o novo como primeiro
	}
	public void print(){
		for(Nodo n = prim; n != null; n = n.getProx()){
			System.out.println(n.getInfo);
		}
	}
}
