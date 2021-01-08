package controles;

import modelos.Veiculo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

public class Mecanica implements Serializable {

    private String nome;
    private ArrayList<Veiculo> veiculos;

    public Mecanica(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }
    public boolean cadastraVeiculo(int codigo, String placa, int ano, String modelo, String cliente ){
        Veiculo v;
        v = new Veiculo(codigo, placa, ano, modelo, cliente);
        if(buscarVeiculo(v.getPlaca())==null){
            this.veiculos.add(v);
            return true;
        }
       return false;
    }

    public boolean cadastraVeiculo(String placa, int ano, String modelo, String cliente ){
        int codigo;
        Veiculo v = new Veiculo(placa);
        if (buscarVeiculo(v.getPlaca()) == null){
            codigo = 1;
            do {
                if(buscarVeiculo(codigo) != null){
                    codigo++;
                }
            }while(buscarVeiculo(codigo) != null);
            Veiculo v = new Veiculo(codigo,placa, ano, modelo, cliente);
            if(buscarVeiculo(v.getPlaca())==null){
                this.veiculos.add(v);
                return true;
            }
            return false;
        }
        Veiculo v = new Veiculo(codigo,placa, ano, modelo, cliente);
        if(buscarVeiculo(v.getPlaca())==null){
            this.veiculos.add(v);
            return true;
        }
        return false;
    }

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
}
