package arquivotexto.escrever;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class MainFormatter {
    public static void main(String[] args) {
        try {
            File file = new File("UmArquivo.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            Formatter fo = new Formatter(bw);

            fo.format("Isso é uma %s formatada\n", "string");
            fo.format("Você pode colocar numeros: %d\n", 10);
            fo.format("Decimais tambem: %f\n", 1.5);

            bw.close();
            fw.close();
            fo.close();
        }catch(IOException e){
            System.out.println("Erro de arquivo: "+e.getMessage());
        }
    }
}