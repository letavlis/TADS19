import java.util.Arrays;
import java.util.ArrayList;


public class MainTeste {

    public static void main(String[] args) {
		Mecanica m = new Mecanica("Silva");
       	m.cadastraVeiculo("abd-2b55", 91, "Gol", "Carol");
       	m.cadastraVeiculo("abd-2b54", 96, "Corsa", "Jose");
       	m.cadastraVeiculo("abd-2b53", 94, "Gol", "Vanessa");
       	m.cadastraVeiculo("abd-2b51", 96, "Monza", "Ana");
       	m.cadastraVeiculo("abd-2b52", 98, "Uno", "Brenda");
       	m.cadastraVeiculo("abd-2b52", 96, "Gol", "Maria");

		m.cadastraServico("Pintura Completa", "Preta", 984.50, 520.45, 250.0);
		ArrayList<String> pecas = new ArrayList<>(Arrays.asList("Filtro", "Cano"));
		m.cadastraServico("Troca de Filtro", pecas, 540.50, 306.45);

		Veiculo v = m.buscarVeiculo(0);
		Servico s = m.buscarServico(0);
		if(v!=null && s!=null)
			m.executaServico(v,s);

		s = m.buscarServico(1);
		v = m.buscarVeiculo(1);
		if(v!=null && s!=null)
			m.executaServico(v,s);

		System.out.println(m.relatorioVeiculos());
		System.out.println(m.relatorioServicos());
		System.out.println(m.relatorioExecucoes());

    }
}
