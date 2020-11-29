package exemploarraylist;

import java.util.ArrayList;


public class MainListaInteiros {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println(lista.size());

        for(int i=0;i<1000;i++){
            lista.add(i+1);
        }

        System.out.println(lista);
        System.out.println();
        System.out.println(lista.size());


    }

}
