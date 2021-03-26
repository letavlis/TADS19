package Mecanica.modelos;

public class Pintura extends Servico{
	private String cor;
	private double valorTinta;
	private double valorCera;

	public Pintura(int codigo, String descricao, String cor, 
					double valorMaodeObra, double valorTinta, double valorCera){
		super(codigo, descricao, valorMaodeObra);
		
		this.cor = cor;
		this.valorTinta = valorTinta;
		this.valorCera = valorCera;
	}

	public String getCor(){
		return this.cor;
	}

	public double getVTnt(){
		return this.valorTinta;
	}

	public double getVCr(){
		return this.valorCera;
	}

	@Override
	public double cTotal(){
		super.valorTotal = super.getValMO()+ getVTnt()+ getVCr();
		return super.valorTotal;
	}
}
