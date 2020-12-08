package arquivotexto.escrever;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class MainTexto {
    public static void main(String[] args) {
        try {
            File file = new File("UmArquivo.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Este é uma linha de um arquivo");
            bw.newLine();
            bw.write("Se quizer escrever um numero: "+10);
            bw.newLine();

            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println("Erro de arquivo: "+e.getMessage());
        }
    }
}
