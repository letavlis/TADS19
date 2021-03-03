package Mecanica.modelos;

import java.io.Serializable;

public class Veiculo implements Serializable{
	private int codigo;
	private int ano;
	private String placa;
	private String modelo;
	private String cliente;

	public Veiculo(int codigo, String placa, int ano, String modelo, String cliente){
		this.codigo = codigo;
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.cliente = cliente;
	}

	public String getPlaca(){
		return this.placa;
	}

	public int getCodigo(){
		return this.codigo;
	}

	public String getCliente(){
		return this.cliente;
	}

	public String getModelo(){
		return this.modelo;
	}

	public int getAno(){
		return this.ano;
	}
}
