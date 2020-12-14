import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main{

	public static String sepData(String ent){
		String[] sepa = ent.split("_");
		ent = sepa[2]+"/"+sepa[3]+"/2020";
		return ent;
	}

    public static void main(String[] args) {
		int maObt = 0;
		int meObt = 0;
		int maCs = 0;
		int meCs = 0;
		String[] dias = new String[4];

		try{
			File[] arqLista = new File("./DadosCovid_102020").listFiles();	
			File dirLista = new File("./DadosCovid_102020");
			String[] fname = dirLista.list();

			String linha;
			for(int i=0; i<arqLista.length; i++){

				BufferedReader buflin = new BufferedReader(
										new FileReader(arqLista[i]));
				
				buflin.readLine();

				int cntOb = 0;
				int cntCs = 0;

        	    while((linha = buflin.readLine())!=null ){
					String[] divi = linha.split(";");
					cntOb += Integer.parseInt(divi[5]);
					cntCs += Integer.parseInt(divi[4]);
        	    }

				if(meCs==0&&meObt==0){
					meCs = cntCs;
					meObt = cntOb;
				}

				if(cntCs > maCs){
					maCs = cntCs;
					dias[0] = fname[i];
				}
				if(cntCs < meCs){
					meCs = cntCs;
					dias[1] = fname[i];
				}
				if(cntOb > maObt){
					maObt = cntOb;
					dias[2] = fname[i];
				}
				if(cntOb < meObt){
					meObt = cntOb;
					dias[3] = fname[i];
				}
			}
			
			System.out.println("Dia com mais casos:\n"+sepData(dias[0]));
			System.out.println("Dia com menos casos:\n"+sepData(dias[1]));
			System.out.println("Dia com mais óbitos:\n"+sepData(dias[2]));
			System.out.println("Dia com menos óbitos:\n"+sepData(dias[3]));

        }catch (IOException e){
            System.out.println("Erro de arquivo!! "+e.getMessage());
        }


    }
}
