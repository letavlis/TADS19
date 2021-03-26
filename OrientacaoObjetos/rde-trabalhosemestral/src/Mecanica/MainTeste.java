package Mecanica;

import Mecanica.controles.Mecanica;
import Mecanica.modelos.Servico;
import Mecanica.modelos.Veiculo;

import java.util.ArrayList;
import java.util.Arrays;


public class MainTeste {

    public static void main(String[] args) {
		Mecanica m = new Mecanica("Perola");
       	m.cadastraVeic("abc-3b25", 1990, "Monza", "Julia");
       	m.cadastraVeic("abe-5d51", 2001, "Cordoba", "Leticia");
       	m.cadastraVeic("abd-3c94", 2004, "Golf", "Valdecir");
       	m.cadastraVeic("abf-8a55", 2005, "Montana", "Jordana");
       	m.cadastraVeic("abj-7k74", 2001, "Uno", "Bruna");
       	m.cadastraVeic("abh-6i33", 1996, "Gol", "Maykon");

		m.cadastraS("Pintura Completa", "Preta", 955.55, 530.25, 253.5);
		ArrayList<String> pecas = new ArrayList<>(Arrays.asList("Filtro", "Cano"));
		m.cadastraS("Troca de Filtro", pecas, 536.50, 321.45);

		Veiculo v = m.buscarVeiculo(0);
		Servico s = m.buscarServico(0);
		if(v!=null && s!=null)
			m.execServ(v,s);

		s = m.buscarServico(1);
		v = m.buscarVeiculo(1);
		if(v!=null && s!=null)
			m.execServ(v,s);

		System.out.println(m.relatorioV());
		System.out.println(m.relatorioS());
		System.out.println(m.relatorioE());

    }
}
