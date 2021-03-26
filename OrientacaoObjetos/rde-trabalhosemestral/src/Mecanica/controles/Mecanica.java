package Mecanica.controles;

import Mecanica.modelos.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class Mecanica implements Serializable {

    private String nome;
    private ArrayList<Veiculo> veics;
    private ArrayList<Servico> servs;
    private ArrayList<ExecutaS> execs;

    public Mecanica(String nome){
        this.nome = nome;
        this.veics = getVeics();
        this.servs = getServs();
        this.execs = getExecs();
    }

    //cadastros
    public boolean cadastraVeic(int codigo, String placa, int ano,
								String modelo, String cliente ){
        Veiculo v = new Veiculo(codigo, placa, ano, modelo, cliente);
        this.veics.add(codigo, v);
        return true;        
    }

    public boolean cadastraVeic(String plc, int ano, String mdl, String clnt ){
        int cod;
        Veiculo exi = buscarVeiculo(plc);

        if(exi==null){
			cod = proxCodV();
			exi = new Veiculo(cod, plc, ano, mdl, clnt);
			this.veics.add(exi);

			try(ObjectOutputStream obs = new ObjectOutputStream(
							new FileOutputStream(
							new File("Veiculos.ser")))){

				obs.writeObject(veics);

				obs.close();
				
				return true;

			}catch(IOException e){
				System.out.println("Erro no arquivo "+e.getMessage());
			}

        }else{
			return false;
        }
		return false;
    }

    public boolean cadastraS(String descricao, ArrayList<String> pecas,
							 double valorMaoDeObra, double valorPecas){
        int codigo;
        codigo = proxCodS();
        cadastraS(codigo, descricao, pecas, valorMaoDeObra, valorPecas);
        return true;
    }

    public boolean cadastraS(String descricao, String cor, double valorMaodeObra,
							 double valorCera, double valortinta){
        int codigo;
        codigo = proxCodS();
        cadastraS(codigo, descricao, cor, valorMaodeObra, valorCera, valortinta);
        return true;
    }

    public boolean cadastraS(int cod, String desc, ArrayList<String> pcs,
							 double vMdeObr, double vPcs){
        Conserto c = new Conserto(cod, desc, pcs, vMdeObr, vPcs);
        this.servs.add(c);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Servicos.ser")))){

			obs.writeObject(servs);
			obs.close();
			
			return true;

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
		return false;
    }

    public boolean cadastraS(int cod, String desc, String cor,
							 double vMdeObr, double vTnt, double vCr){
        Pintura p = new Pintura(cod, desc, cor, vMdeObr, vCr, vTnt);
        this.servs.add(p);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Servicos.ser")))){

			obs.writeObject(servs);
			obs.close();
		
			return true;

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
		return false;
    }

    //executa servico
    public void execServ(int cod, Veiculo veic, Servico serv){
        ExecutaS ex = new ExecutaS(cod, veic, serv);
        this.execs.add(ex);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Executados.ser")))){

			obs.writeObject(execs);
			obs.close();

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
    }

    public void execServ(Veiculo veic, Servico serv){
        int codigo;
        codigo = proxCodE();
        execServ(codigo, veic, serv);
    }

	//##### RELATORIOS:
	
	public String relatorioV(){
		String str = "\nVeiculos:\n";
		for(Veiculo v: this.veics){
			str += "\t"+v.getCod()+"|"+v.getCliente();
			str += ": "+v.getPlc()+" "+v.getMdl();
			str += "/"+v.getAno()+"\n";
		}
		//str+="\n";
		return str;
	}

	public String relatorioS(){
		String str = "Serviços:";
		for(Servico s: this.servs){
			str+="\n\t"+s.getCodigo()+"|"+s.getDesc()+"\n\t";
			str+="\tMão de Obra: "+s.getValMO()+"\n";
			if(s instanceof Conserto){
				Conserto cns = (Conserto) s;
				str+="\t\tPeças: ";
				for(String p: cns.getPcs()){
					str+=p+";";
				}
				str+="\n\t\tValor das Peças: "+cns.getVPcs();
			}else{
				Pintura pin = (Pintura) s;
				str+="\t\tValor da tinta: "+pin.getVTnt();
				str+="\n\t\tValor da cera: "+pin.getVCr();
				str+="\n\t\tCor: "+pin.getCor();
			}
		}
		str+="\n";
		return str;
	}

	public String relatorioE(){
		String str = "Serviços Executados:";
		for(ExecutaS ex: this.execs){
			str+="\n\n\t"+ex.getCod()+"|";

			Veiculo v = ex.getVeic();
			str += v.getCliente();
			str += ": "+v.getPlc()+" "+v.getMdl();
			str += "/"+v.getAno()+"\n";

			Servico s = ex.getServico();
			str+="\t"+s.getDesc()+"\n\t";
			str+="\tMão de Obra: "+s.getValMO()+"\n";
			if(s instanceof Conserto){
				Conserto cns = (Conserto) s;
				str+="\t\tPeças: ";
				for(String p: cns.getPcs()){
					str+=p+";";
				}
				str+="\n\t\tValor das Peças: "+cns.getVPcs();
				str+="\n\t\tValor Total: "+cns.cTotal();
			}else{
				Pintura pin = (Pintura) s;
				str+="\t\tValor da tinta: "+pin.getVTnt();
				str+="\n\t\tValor da cera: "+pin.getVCr();
				str+="\n\t\tCor: "+pin.getCor();
				str+="\n\t\tValor Total: "+pin.cTotal();
			}
			//str+="\n\t\tValor Total: "+ex.calculaTotal();
		}
		str+="\n";
		return str;
	}

    //##### BUSCAS
	
    public Veiculo buscarVeiculo(int cod){
        Optional<Veiculo> ret = this.veics.stream()
					.filter((veic -> veic.getCod()==cod))
					.findFirst();
		if(ret.isPresent()){
			return ret.get();
		}
		return null;
    }

    public Veiculo buscarVeiculo(String plc){
        Optional<Veiculo> ret = this.veics.stream()
					.filter((veiculo -> veiculo.getPlc()==plc))
					.findFirst();
		if(ret.isPresent()){
			return ret.get();
		}
        return null;
    }

    public Servico buscarServico(int codigo){
        Optional<Servico> ret = this.servs.stream()
					.filter((servico -> servico.getCodigo()==codigo))
					.findFirst();
		if(ret.isPresent()){
			return ret.get();
		}
		return null;
		/*####LEMBRAR#######
		*	Talvez usar typeOf para identificar o tipo de serviço. 
		*/
	}

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVeics(ArrayList<Veiculo> veics) {
        this.veics = veics;
    }

    public ArrayList<Veiculo> getVeics() {
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		try(ObjectInputStream in = new ObjectInputStream(
								new FileInputStream("Veiculos.ser"))){

			lista = (ArrayList<Veiculo>)in.readObject();
			in.close();

			return lista;

		}catch(ClassNotFoundException e){
			System.out.println("Você tentou ler uma classe não definida");
		}catch(EOFException e){
			System.out.println("Fim do arquivo.");
		}catch(IOException e){
			System.out.println("Erro de arquivo. "+e.getMessage());
		}
		return lista;
    }

	public ArrayList<Servico> getServs(){
		ArrayList<Servico> lista = new ArrayList<Servico>();
		try(ObjectInputStream in = new ObjectInputStream(
								new FileInputStream("Servicos.ser"))){

			lista = (ArrayList<Servico>)in.readObject();
			in.close();

			return lista;

		}catch(ClassNotFoundException e){
			System.out.println("Você tentou ler uma classe não definida");
		}catch(EOFException e){
			System.out.println("Fim do arquivo.");
		}catch(IOException e){
			System.out.println("Erro de arquivo. "+e.getMessage());
		}
		return lista;
    }

	public ArrayList<ExecutaS> getExecs(){
		ArrayList<ExecutaS> lista = new ArrayList<ExecutaS>();
		try(ObjectInputStream in = new ObjectInputStream(
								new FileInputStream("Executados.ser"))){

			lista = (ArrayList<ExecutaS>)in.readObject();
			in.close();

			return lista;

		}catch(ClassNotFoundException e){
			System.out.println("Você tentou ler uma classe não definida");
		}catch(EOFException e){
			System.out.println("Fim do arquivo.");
		}catch(IOException e){
			System.out.println("Erro de arquivo. "+e.getMessage());
		}
		return lista;
	}

    private int proxCodV(){
        int i;
        i = veics.size();
        return i;
    }

    private int proxCodS() {
        int i;
        i = servs.size();
        return i;
    }

    private int proxCodE(){
        int i;
        i = execs.size();
        return i;
    }

    @Override
    public String toString() {
        return "Mecanica{" +
                "nome='" + nome + '\'' +
                ", veiculos=" + this.veics +
                "}\n";
    }
}
