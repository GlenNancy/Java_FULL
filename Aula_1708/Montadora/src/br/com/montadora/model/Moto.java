package br.com.montadora.model;

public class Moto extends Veiculo{

	private int quantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return quantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		this.quantidadeAdesivos = quantidadeAdesivos;
	}
	
	public String MostrarAtributos() {
		return "Modelo da moto: " + getModelo() +
				"\nPeso da moto: " + getPeso() +
				"\nQuantidade de adesivos: " + getQuantidadeAdesivos();
	}
}
