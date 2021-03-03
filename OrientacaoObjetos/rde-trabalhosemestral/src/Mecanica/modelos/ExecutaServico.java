package Mecanica.modelos;

import java.io.Serializable;

public class ExecutaServico implements Serializable{
	private int codigo;
	private String data;
	private Veiculo veiculo;
	private Servico servico;
	private double total;

	public ExecutaServico(int codigo, Veiculo veiculo, Servico servico){
		this.codigo = codigo;
		this.veiculo = veiculo;
		this.servico = servico;
	}

	public int getCodigo(){
		return this.codigo;
	}

	public Veiculo getVeiculo(){
		return this.veiculo;
	}

	public Servico getServico(){
		return this.servico;
	}

	public double getTotal(){
		return this.total;
	}
}
