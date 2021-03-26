package Mecanica.modelos;

import java.io.Serializable;

public class Servico implements Serializable{
	private int codigo;
	private String descricao;
	protected double valorMaodeObra;
	protected double valorTotal;

	public Servico(int codigo, String descricao, double valorMaodeObra){
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorMaodeObra = valorMaodeObra;
	}

	public double cTotal(){
		return this.valorTotal;
	}

	public int getCodigo(){
		return this.codigo;
	}

	public String getDesc(){
		return this.descricao;
	}

	public double getValMO(){
		return this.valorMaodeObra;
	}
}
