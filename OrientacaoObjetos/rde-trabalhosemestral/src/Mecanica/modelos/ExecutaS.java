package Mecanica.modelos;

import java.io.Serializable;

public class ExecutaS implements Serializable{
	private int codigo;
	private String data;
	private Veiculo veiculo;
	private Servico servico;
	private double total;

	public ExecutaS(int codigo, Veiculo veiculo, Servico servico){
		this.codigo = codigo;
		this.veiculo = veiculo;
		this.servico = servico;
	}

	public int getCod(){
		return this.codigo;
	}

	public Veiculo getVeic(){
		return this.veiculo;
	}

	public Servico getServico(){
		return this.servico;
	}

	public double getTotal(){
		return this.total;
	}
}
