import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.EOFException;

public class Mecanica implements Serializable {

    private String nome;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Servico> servicos;
    private ArrayList<ExecutaServico> execucoes;

    public Mecanica(String nome){
        this.nome = nome;
        this.veiculos = getVeiculos();
        this.servicos = getServicos();
        this.execucoes = getExecs();
    }

    //cadastros
    public boolean cadastraVeiculo(int codigo, String placa, int ano, 
									String modelo, String cliente ){
        Veiculo v = new Veiculo(codigo, placa, ano, modelo, cliente);
        this.veiculos.add(codigo, v);
        return true;        
    }

    public boolean cadastraVeiculo(String placa, int ano, String modelo, String cliente ){
        int codigo;
        Veiculo exi = buscarVeiculo(placa); 

        if(exi==null){
			codigo = proximoCodigoVeiculo();
			exi = new Veiculo(codigo, placa, ano, modelo, cliente);
			this.veiculos.add(exi);

			try(ObjectOutputStream obs = new ObjectOutputStream(
							new FileOutputStream(
							new File("Veiculos.ser")))){

				obs.writeObject(veiculos);

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

    public boolean cadastraServico(String descricao, ArrayList<String> pecas,
									double valorMaoDeObra, double valorPecas){
        int codigo;
        codigo = proximoCodigoServico();
        cadastraServico(codigo, descricao, pecas, valorMaoDeObra, valorPecas);
        return true;
    }

    public boolean cadastraServico(String descricao, String cor, double valorMaodeObra,
									double valorCera, double valortinta){
        int codigo;
        codigo = proximoCodigoServico();
        cadastraServico(codigo, descricao, cor, valorMaodeObra, valorCera, valortinta);
        return true;
    }

    public boolean cadastraServico(int codigo, String descricao, ArrayList<String> pecas,
									double valorMaoDeObra, double valorPecas){
        Conserto c = new Conserto(codigo, descricao, pecas, valorMaoDeObra, valorPecas);
        this.servicos.add(c);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Servicos.ser")))){

			obs.writeObject(servicos);
			obs.close();
			
			return true;

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
		return false;
    }

    public boolean cadastraServico(int codigo, String descricao,String cor,
									double valorMaodeObra, double valorTinta, double valorCera){
        Pintura p = new Pintura(codigo, descricao, cor, valorMaodeObra, valorCera, valorTinta);
        this.servicos.add(p);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Servicos.ser")))){

			obs.writeObject(servicos);
			obs.close();
		
			return true;

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
		return false;
    }

    //executa servico
    public void executaServico(int codigo, Veiculo veiculo, Servico servico){
        ExecutaServico ex = new ExecutaServico(codigo, veiculo, servico);
        this.execucoes.add(ex);

		try(ObjectOutputStream obs = new ObjectOutputStream(
						new FileOutputStream(
						new File("Executados.ser")))){

			obs.writeObject(execucoes);
			obs.close();

		}catch(IOException e){
			System.out.println("Erro no arquivo "+e.getMessage());
		}
    }

    public void executaServico(Veiculo veiculo, Servico servico){
        int codigo;
        codigo = proximoCodigoExecucao();
        executaServico(codigo, veiculo, servico);
    }

	//##### RELATORIOS:
	
	public String relatorioVeiculos(){
		String str = "\nVeiculos:\n";
		for(Veiculo v: this.veiculos){
			str += "\t"+v.getCodigo()+"|"+v.getCliente();
			str += ": "+v.getPlaca()+" "+v.getModelo();
			str += "/"+v.getAno()+"\n";
		}
		//str+="\n";
		return str;
	}

	public String relatorioServicos(){
		String str = "Serviços:";
		for(Servico s: this.servicos){
			str+="\n\t"+s.getCodigo()+"|"+s.getDesc()+"\n\t";
			str+="\tMão de Obra: "+s.getValMO()+"\n";
			if(s instanceof Conserto){
				Conserto cns = (Conserto) s;
				str+="\t\tPeças: ";
				for(String p: cns.getPecas()){
					str+=p+";";
				}
				str+="\n\t\tValor das Peças: "+cns.getValPecas();
			}else{
				Pintura pin = (Pintura) s;
				str+="\t\tValor da tinta: "+pin.getVTinta();
				str+="\n\t\tValor da cera: "+pin.getVCera();
				str+="\n\t\tCor: "+pin.getCor();
			}
		}
		str+="\n";
		return str;
	}

	public String relatorioExecucoes(){
		String str = "Serviços Executados:";
		for(ExecutaServico ex: this.execucoes){
			str+="\n\n\t"+ex.getCodigo()+"|";

			Veiculo v = ex.getVeiculo();
			str += v.getCliente();
			str += ": "+v.getPlaca()+" "+v.getModelo();
			str += "/"+v.getAno()+"\n";

			Servico s = ex.getServico();
			str+="\t"+s.getDesc()+"\n\t";
			str+="\tMão de Obra: "+s.getValMO()+"\n";
			if(s instanceof Conserto){
				Conserto cns = (Conserto) s;
				str+="\t\tPeças: ";
				for(String p: cns.getPecas()){
					str+=p+";";
				}
				str+="\n\t\tValor das Peças: "+cns.getValPecas();
				str+="\n\t\tValor Total: "+cns.calculaTotal();
			}else{
				Pintura pin = (Pintura) s;
				str+="\t\tValor da tinta: "+pin.getVTinta();
				str+="\n\t\tValor da cera: "+pin.getVCera();
				str+="\n\t\tCor: "+pin.getCor();
				str+="\n\t\tValor Total: "+pin.calculaTotal();
			}
			//str+="\n\t\tValor Total: "+ex.calculaTotal();
		}
		str+="\n";
		return str;
	}

    //##### BUSCAS
	
    public Veiculo buscarVeiculo(int codigo){
        Optional<Veiculo> ret = this.veiculos.stream()
					.filter((veiculo -> veiculo.getCodigo()==codigo))
					.findFirst();
		if(ret.isPresent()){
			return ret.get();
		}
		return null;
    }

    public Veiculo buscarVeiculo(String placa){
        Optional<Veiculo> ret = this.veiculos.stream()
					.filter((veiculo -> veiculo.getPlaca()==placa))
					.findFirst();
		if(ret.isPresent()){
			return ret.get();
		}
        return null;
    }

    public Servico buscarServico(int codigo){
        Optional<Servico> ret = this.servicos.stream()
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

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public ArrayList<Veiculo> getVeiculos() {
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

	public ArrayList<Servico> getServicos(){
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

	public ArrayList<ExecutaServico> getExecs(){
		ArrayList<ExecutaServico> lista = new ArrayList<ExecutaServico>();
		try(ObjectInputStream in = new ObjectInputStream(
								new FileInputStream("Executados.ser"))){

			lista = (ArrayList<ExecutaServico>)in.readObject();
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

    private int proximoCodigoVeiculo(){
        int i;
        i = veiculos.size();
        return i;
    }

    private int proximoCodigoServico() {
        int i;
        i = servicos.size();
        return i;
    }

    private int proximoCodigoExecucao(){
        int i;
        i = execucoes.size();
        return i;
    }

    @Override
    public String toString() {
        return "Mecanica{" +
                "nome='" + nome + '\'' +
                ", veiculos=" + this.veiculos +
                "}\n";
    }
}
