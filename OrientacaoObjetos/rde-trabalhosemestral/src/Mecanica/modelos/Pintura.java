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

	public double getVTinta(){
		return this.valorTinta;
	}

	public double getVCera(){
		return this.valorCera;
	}

	@Override
	public double calculaTotal(){
		super.valorTotal = super.getValMO()+getVTinta()+getVCera();
		return super.valorTotal;
	}
}
