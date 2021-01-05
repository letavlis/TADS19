package controles;
import modelos.Veiculo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Mecanica {

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
        Veiculo v = new Veiculo(,placa, ano, modelo, cliente);
        if(buscarVeiculo(v.getPlaca())==null){
            this.veiculos.add(v);
            return true;
        }
        return false;
    }

    public Veiculo buscarVeiculo(int codigo){
        Veiculo v;
        v = new Veiculo(codigo, "",,"","");
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

}
