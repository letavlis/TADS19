package controles;

import modelos.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

public class Mecanica implements Serializable {

    private String nome;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Servico> servicos;
    private ArrayList<ExecucaoServico> execucoes;

    public Mecanica(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.execucoes =new ArrayList<>();
    }
    //cadastros
    public boolean cadastraVeiculo(int codigo, String placa, int ano, String modelo, String cliente ){
        Veiculo v = new Veiculo(codigo, placa, ano, modelo, cliente);
        this.veiculos.add(codigo, v);
        return true;        
    }

    public boolean cadastraVeiculo(String placa, int ano, String modelo, String cliente ){
        int codigo;
        Veiculo v = new Veiculo(placa);
        if(buscarVeiculo(v.getPlaca())==null){
          codigo = proximoCodigoVeiculo();
          v = new Veiculo(codigo, placa, ano, modelo, cliente);
          this.veiculos.add(v);
        }
        else {
          codigo = this.veiculos.indexOf(buscarVeiculo(placa)); 
          this.veiculos.remove(codigo);
          cadastraVeiculo(codigo, placa, ano, modelo, cliente);
        }
        return true;
    }
    public boolean cadastraServico(int codigo, String descricao, ArrayList<String> pecas, double valorMaoDeObra, double valorPecas){
        Conserto c = new Conserto(codigo, descricao, pecas, valorMaoDeObra, valorPecas);
        this.servicos.add(c);
        return true;
    }
    public boolean cadastraServico(String descricao, ArrayList<String> pecas, double valorMaoDeObra, double valorPecas){
        int codigo;
        codigo = proximoCodigoServico();
        cadastraServico(codigo, descricao, pecas, valorMaoDeObra, valorPecas);
        return true;
    }
    public boolean cadastraServico(int codigo, String descricao,String cor, double valorMaodeObra, double valorTinta, double valorCera){
        Pintura p = new Pintura(codigo, descricao, cor, valorMaodeObra, valorCera, valorTinta);
        this.servicos.add(p);
        return true;
    }
    public boolean cadastraServico(String descricao, String cor, double valorMaodeObra, double valorCera, double valortinta){
        int codigo;
        codigo = proximoCodigoServico();
        cadastraServico(codigo, descricao, cor, valorMaodeObra, valorCera, valortinta);
        return true;
    }

    //executa servico
    public void executaServico(int codigo, Veiculo veiculo, Servico servico{

    }
    public void executaServico(Veiculo veiculo, Servico servico){
        int codigo;
        codigo = proximoCodigoExecucao();
        executaServico(codigo, veiculo,servico);
    }

    //buscas
    public Veiculo buscarVeiculo(int codigo){
        Veiculo v;
        v = new Veiculo(codigo);
        int pos = this.veiculos.indexOf(v);
        if(pos != -1){
            return this.veiculos.get(pos);
        }
        return null;
    }
    public Veiculo buscarVeiculo(String placa){
        Optional<Veiculo> ret = this.veiculos.stream().filter((veiculo -> veiculo.getPlaca().equals(placa))).findFirst();
        if(ret.isPresent()){
            return ret.get();
        }
        return null;
    }
    public Servico buscarServico(int codigo){
       Pintura p = new Pintura(codigo);
       Conserto c = new Conserto(codigo);
       int pos = this.servicos.indexOf(p);
       int i = this.servicos.indexOf(c);
       if(pos != -1){
           return this.servicos.get(pos);
       }
       else if(i != -1){
           return this.servicos.get(i);
       }
       else
       return null;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
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
                ", veiculos=" + veiculos +
                "}\n";
    }
}
