public class Main {

    public static void main(String[] args) {
        Lista lista;
        System.out.println("Lista Ordenada");
        lista = new Lista();
        lista.addInOrder(33);
        lista.addInOrder(22);
        lista.addInOrder(45);
        lista.addInOrder(70);
        lista.addInOrder(30);
        lista.addInOrder(20);
        System.out.println("Imprimindo valores:\n");
        lista.print(lista.getRaiz());
        System.out.println("\nImprimindo valores inversamente:\n");
        lista.printReverso(lista.getRaiz());
    }
}
