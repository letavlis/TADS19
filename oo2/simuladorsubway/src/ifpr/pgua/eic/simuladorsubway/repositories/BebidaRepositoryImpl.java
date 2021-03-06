package ifpr.pgua.eic.simuladorsubway.repositories;

import ifpr.pgua.eic.simuladorsubway.models.Bebida;
import ifpr.pgua.eic.simuladorsubway.models.Ingrediente;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.BebidaRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Optional;

public class BebidaRepositoryImpl implements BebidaRepository {

    private ObservableList<Bebida> bebidas;


    public BebidaRepositoryImpl(){
        bebidas = FXCollections.observableArrayList();
    }


    @Override
    public boolean adicionar(Bebida bebida) {

        bebidas.add(new Bebida(bebidas.size(),bebida.getNome(),bebida.getValor()));

        return true;
    }

    @Override
    public boolean editar(int id, Bebida bebida) {

        Bebida antiga = bebidas.stream().filter(b -> b.getId() == id).findFirst().get();

        if(antiga != null){

            antiga.setNome(bebida.getNome());
            antiga.setValor(bebida.getValor());

            return true;
        }

        return false;
    }
    @Override
    public Bebida buscarBebida(String nome){
        Optional<Bebida> ret = bebidas.stream()
                .filter((b -> b.getNome().equals(nome)))
                .findFirst();
        return ret.orElse(null);
    }

    @Override
    public ObservableList<Bebida> lista() {
        return FXCollections.unmodifiableObservableList(bebidas);
    }
}
