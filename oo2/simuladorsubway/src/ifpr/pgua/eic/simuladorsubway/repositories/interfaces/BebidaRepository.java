package ifpr.pgua.eic.simuladorsubway.repositories.interfaces;

import ifpr.pgua.eic.simuladorsubway.models.Bebida;
import javafx.collections.ObservableList;

public interface BebidaRepository {

    boolean adicionar(Bebida bebida);
    boolean editar(int id, Bebida bebida);

    Bebida buscarBebida(String nome);

    ObservableList<Bebida> lista();


}
