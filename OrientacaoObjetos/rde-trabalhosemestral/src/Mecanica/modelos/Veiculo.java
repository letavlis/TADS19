package Mecanica.modelos;

import java.io.Serializable;

public class Veiculo implements Serializable{
	private int cod;
	private int ano;
	private String placa;
	private String modelo;
	private String cliente;

	public Veiculo(int cod, String placa, int ano, String modelo, String cliente){
		this.cod = cod;
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.cliente = cliente;
	}

	public String getPlc(){
		return this.placa;
	}

	public int getCod(){
		return this.cod;
	}

	public String getCliente(){
		return this.cliente;
	}

	public String getMdl(){
		return this.modelo;
	}

	public int getAno(){
		return this.ano;
	}
}
