public class Lista {
    private Nodo head;
    private Nodo tail;

    public Lista(){
        head = null;
        tail = null;
    }
    public void print(Nodo n){
        if (n!=null){
            System.out.println(n.getInfo());
            print(n.getProx());
        }
    }
    public Nodo getRaiz(){
        return head;
    }
    public void addInicio(int i){
        Nodo novo = new Nodo();
        novo.setInfo(i);
        novo.setProx(head);
        head = novo;
    }
    public void addFinal(int i){
        Nodo novo = new Nodo();
        novo.setInfo(i);
        novo.setProx(tail);
        tail = novo;
    }
    public void addInOrder(int i){
        if (head == null){
            addInicio(i);
            tail = head;
        }
        else if (head.getInfo() > i) addInicio(i);
        else if(tail.getInfo() < i) addFinal(i);
        else{
            Nodo novo = new Nodo();
            Nodo x;
            novo.setInfo(i);
            x = head;
            while(x.getProx().getInfo() < novo.getInfo()){
                x = x.getProx();
                if(x.getProx() == null)break;
            }
            novo.setProx(x.getProx());
            x.setProx(novo);
        }
    }
    public void removeInicio(){
        head = head.getProx();
    }
    public void printReverso(Nodo n){
        if (n!=null){
            printReverso(n.getProx());
            System.out.println(n.getInfo());
        }
    }

}
