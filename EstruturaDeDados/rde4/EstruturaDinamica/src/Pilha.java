public class Pilha{
	private Nodo top;

	public void criaPilha(){
		top = null
	}
	public Nodo getTop(){
		return top;
	}
	public void push(int i){
		Nodo novo = new Nodo();
		novo.setInfo(i);
		novo.setProx(top);
		top = novo;
	}
	public void pop(){
		if (top == null)
			System.out.println("Pilha vazia");
		else top = top.getProx();
	}
	public void print(Nodo n){
		if (n!=null){
			System.out.println(n.getInfo());
			print(n.getProx());
		}
	}
	public void printOrd(Nodo n){
		if (n!=null){
			printOrd(n.getProx());
			System.out.println(n.getInfo());
		}
	}
}
