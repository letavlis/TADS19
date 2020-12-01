public class Main{
    public static void useLista(){
        Lista lista;
        System.out.println("Lista Encadeada");
        lista = new Lista();
        lista.criaLista();
        lista.print();
        lista.addInicio(30);
        lista.addInicio(17);
        lista.addInicio(13);
        System.out.println("Imrpime lista");
        lista.print();
        System.out.println("Imprime reverso");
        lista.printReverso();
    }
    public static void usePilha(){
	    Pilha pilha;
	    pilha = new Pilha();
	    pilha.criaPilha();
	    pilha.push(11);
	    pilha.push(44);
	    pilha.push(49);
        System.out.println("Imprime pilha");
	    pilha.print(pilha.getTop());
        System.out.println("Imprime inverso");
	    pilha.printOrd(pilha.getTop());
	    pilha.pop();
    }
    public static void main(String[] args){
	    //useLista();
	    usePilha();
    }
}
