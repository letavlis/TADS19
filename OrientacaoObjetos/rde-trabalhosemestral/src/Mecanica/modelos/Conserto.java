package Mecanica.modelos;

import java.util.Arrays;
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

	public ArrayList<String> getPecas(){
		return this.pecas;
	}

	public double getValPecas(){
		return this.valorPecas;
	}

	public int getCodigo(){
		return super.getCodigo();
	}

	public String getDesc(){
		return super.getDesc();
	}

	@Override
	public double calculaTotal(){
		super.valorTotal = getValPecas() + super.getValMO();
		return super.valorTotal;
	}
}
