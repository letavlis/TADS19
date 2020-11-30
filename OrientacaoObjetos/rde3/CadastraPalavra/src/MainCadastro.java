import java.util.*;
import java.util.stream.Collectors;

public class MainCadastro {
    public static void main(String[] args) {
        String op,palavra;
        int quant;
        char ini;
        Map<String, Character> mapa = new HashMap<>();
        Map<String, Integer> outromapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Digite a palavra:");
            palavra = scanner.nextLine();
            quant = palavra.length();
            ini = palavra.charAt(0);
            mapa.put(palavra,ini);
            outromapa.put(palavra,quant);
            System.out.println("Continuar? s-sim");
            op = scanner.nextLine();
        }while (op.equals("s"));
        for(String chave:mapa.keySet()){
            System.out.println("Inicial -> "+mapa.get(chave)+" -> Palavra:"+chave);
        }
        for(String chave:outromapa.keySet()){
            System.out.println("quantidade de caracter -> "+outromapa.get(chave)+" ->palavra:"+chave);
        }
        System.out.println("Palavras ordenadas pela quantidade de caracter - em modo crescente");
        Map<String, Integer> outromapaOrd = outromapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        outromapaOrd.forEach((key, value) -> System.out.println(value + " - " + key));
        System.out.println("Palavras ordenadas pela inicial - em modo crescente");
        Map<String, Character> mapaOrd = mapa.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        mapaOrd.forEach((key, value) -> System.out.println(value + " - " + key));
    }
}
