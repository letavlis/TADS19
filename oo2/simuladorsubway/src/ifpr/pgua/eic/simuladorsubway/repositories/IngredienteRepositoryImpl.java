package ifpr.pgua.eic.simuladorsubway.repositories;

import ifpr.pgua.eic.simuladorsubway.models.Cliente;
import ifpr.pgua.eic.simuladorsubway.models.Ingrediente;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.IngredienteRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Optional;

public class IngredienteRepositoryImpl implements IngredienteRepository {

    private ObservableList<Ingrediente> ingredientes;


    public IngredienteRepositoryImpl(){

        ingredientes = FXCollections.observableArrayList();
    }
    @Override
    public boolean adicionar(Ingrediente ingrediente){
        ingredientes.add(new Ingrediente(ingredientes.size(),ingrediente.getNome(),ingrediente.getDescricao(), ingrediente.getValor()));
        return true;
    }
    @Override
    public boolean editar(int id, Ingrediente ingrediente){

        for(Ingrediente i:ingredientes){
            if(i.getId() == id){
                i.setNome(ingrediente.getNome());
                i.setDescricao(ingrediente.getDescricao());
                i.setValor(ingrediente.getValor());

                return true;
            }
        }

        return false;
    }
    public Ingrediente buscarIngrediente(String nome){
        Optional<Ingrediente> ret = ingredientes.stream()
                .filter((i -> i.getNome().equals(nome)))
                .findFirst();
        return ret.orElse(null);
    }

    public ObservableList<Ingrediente> lista(){
        return FXCollections.unmodifiableObservableList(ingredientes);
    }


}
