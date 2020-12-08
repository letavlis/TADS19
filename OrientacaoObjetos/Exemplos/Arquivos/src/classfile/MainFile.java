package classfile;
import java.io.File;
public class MainFile {

    public static void main(String[] args) {

        File arq = new File("UmArquivo.txt");
        if (arq.exists()){
            System.out.println("O arquivo existe..");
        }else{
            System.out.println("O arquivo n existe..");
        }

        File dir = new File("UmaPasta");
        if (dir.exists()){
            System.out.println("A pasta existe..");
            System.out.println("Conteudo:");
            String[] itens = dir.list();
            for (int i = 0; i < itens.length;i++){
                System.out.println("\t"+itens[i]);
            }
        }else{
            System.out.println("A pasta n existe..");
            dir.mkdir();
        }

    }
}
