package Mecanica.modelos;

import java.util.ArrayList;

public class Conserto extends Servico{
	private double valorPecas;
	private ArrayList<String> pecas;

	public Conserto(int codigo, String descricao, ArrayList<String> pecas, 
					double valorMaodeObra, double valorPecas){

		super(codigo, descricao, valorMaodeObra);

		this.pecas = pecas;
		this.valorPecas = valorPecas;
	}

	public ArrayList<String> getPcs(){
		return this.pecas;
	}

	public double getVPcs(){
		return this.valorPecas;
	}

	public int getCodigo(){
		return super.getCodigo();
	}

	public String getDesc(){
		return super.getDesc();
	}

	@Override
	public double cTotal(){
		super.valorTotal = getVPcs() + super.getValMO();
		return super.valorTotal;
	}
}
