package br.com.montadora.model;

public class Carro extends Veiculo{

	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public String MostrarAtributos() {
		return "Modelo do carro: " + getModelo() +
				"\nPeso do carro: " + getPeso() +
				"\nQuantidade de portas: " + getQuantidadePortas();
	}
	
}
