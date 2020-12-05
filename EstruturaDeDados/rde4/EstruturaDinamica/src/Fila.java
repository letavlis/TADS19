public class Fila {
    private Nodo head;
    private Nodo tail;

    public Fila(){//construtor deixa a fila zerada
        tail = null;
        head = null;
    }

    public Nodo getTail() {//retorna a cauda
        return tail;
    }

    public Nodo getHead() {//retorna a cabeça
        return head;
    }

    public void enqueue(int i){
        Nodo novo = new Nodo();// inicia um novo nó
        novo.setInfo(i);// recebe o valor da info
        if(tail == null){//verifica se a fila está vazia
            head = novo;//define como sendo o "novo"
            tail = novo;// define como sendo o "novo"
        }
        else{//se não estiver vazia
            tail.setProx(novo);// aloca no final da fila
            tail = novo;//atualiza o nó cauda
        }
    }
    public void dequeue(){
        if(head == null){//testa se a cabeça da fila está vazia
            System.out.println("Fila vazia");
        }
        else head=head.getProx();//senão atualiza a fila para começar no proximo elemento
    }
    public void print(Nodo n){
        if(n != null){
            System.out.println(n.getInfo()+"->");
            print(n.getProx());
        }
        else System.out.println("NULL");
    }
}
