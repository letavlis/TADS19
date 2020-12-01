public class Main{
    public static void main(String[] args){
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
}
