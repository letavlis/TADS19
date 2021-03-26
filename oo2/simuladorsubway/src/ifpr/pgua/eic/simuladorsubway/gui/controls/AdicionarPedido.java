package ifpr.pgua.eic.simuladorsubway.gui.controls;

import ifpr.pgua.eic.simuladorsubway.Main;
import ifpr.pgua.eic.simuladorsubway.models.*;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.BebidaRepository;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.ClienteRepository;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.IngredienteRepository;
import ifpr.pgua.eic.simuladorsubway.repositories.interfaces.PedidoRepository;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.util.Callback;




public class AdicionarPedido {

    @FXML
    private ListView<Ingrediente> ltwIngredientes;

    @FXML
    private ListView<Bebida> ltwBebidas;

    @FXML
    private ListView<Cliente> ltwClientes;


    @FXML
    private Text txtValor;

    private IngredienteRepository ingredienteRepository;
    private BebidaRepository bebidaRepository;
    private ClienteRepository clienteRepository;
    private PedidoRepository pedidoRepository;

    private Sanduiche sanduiche;

    public AdicionarPedido(IngredienteRepository ingredienteRepository,
                           BebidaRepository bebidaRepository,
                           ClienteRepository clienteRepository,
                           PedidoRepository pedidoRepository){
        this.ingredienteRepository = ingredienteRepository;
        this.bebidaRepository = bebidaRepository;
        this.clienteRepository = clienteRepository;
        this.pedidoRepository = pedidoRepository;

        sanduiche = new Sanduiche();
    }

    @FXML
    private void initialize(){

        ltwClientes.setCellFactory(clienteListView -> new ListCell<>(){
            @Override
            protected void updateItem(Cliente cliente, boolean b) {
                super.updateItem(cliente,b);

                if(cliente != null){
                    setText(cliente.getNome());
                }else{
                    setText("");
                }
            }
        });

        ltwClientes.setItems(clienteRepository.lista());

        ltwIngredientes.setCellFactory(new Callback<ListView<Ingrediente>, ListCell<Ingrediente>>() {
            @Override
            public ListCell<Ingrediente> call(ListView<Ingrediente> ingredienteListView) {
                return new ListCell<>(){
                    @Override
                    protected void updateItem(Ingrediente ingrediente, boolean b) {
                        super.updateItem(ingrediente, b);

                        if(ingrediente != null){
                            setText(ingrediente.getNome());

                            if(sanduiche.getIngredientes().contains(ingrediente)){
                                setStyle("-fx-background-color: gray");
                            }else{
                                setStyle(getStyle().replace("-fx-background-color: gray",""));
                            }

                        }else{
                            setText("");
                        }

                    }
                };
            }
        });

        ltwIngredientes.setItems(ingredienteRepository.lista());

        ltwBebidas.setCellFactory(bebidaListView -> new ListCell<>(){
            @Override
            protected void updateItem(Bebida bebida, boolean b) {
                super.updateItem(bebida, b);

                if(bebida != null){
                    setText(bebida.getNome());
                }else{
                    setText("");
                }
            }
        });

        ltwBebidas.setItems(bebidaRepository.lista());

    }

    @FXML
    private void processaIngrediente(MouseEvent evt){
        Ingrediente ingrediente = ltwIngredientes.getSelectionModel().getSelectedItem();

        if(evt.getClickCount() == 1 && evt.getButton() == MouseButton.PRIMARY){

            if(ingrediente != null){
                sanduiche.adiciona(ingrediente);
            }
        }else if(evt.getButton() == MouseButton.SECONDARY){
            if(ingrediente != null){
                sanduiche.remove(ingrediente);
            }
        }
        ltwIngredientes.refresh();
        ltwIngredientes.getSelectionModel().clearSelection();
        txtValor.setText("R$ "+sanduiche.getValorTotal());
    }

    @FXML
    private void adicionar(){

        pedidoRepository.adicionar(sanduiche);

        Cliente cliente = ltwClientes.getSelectionModel().getSelectedItem();
        Bebida bebida = ltwBebidas.getSelectionModel().getSelectedItem();


        Pedido pedido = new Pedido(sanduiche,bebida,cliente);

        pedidoRepository.adicionar(pedido);

        Main.voltaPrincipal();

    }

    @FXML
    private void cancelar(){
        Main.voltaPrincipal();
    }


}
