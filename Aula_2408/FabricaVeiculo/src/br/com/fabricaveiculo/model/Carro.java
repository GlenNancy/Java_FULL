package br.com.fabricaveiculo.model;

public class Carro extends Veiculo {

	private int quantidadePortas;
	private double pesoEngate;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public double getPesoEngate() {
		return pesoEngate;
	}

	public void setPesoEngate(double pesoEngate) {
		this.pesoEngate = pesoEngate;
	}

	public void mostrarAtributos() {
		System.out.println("Modelo do veiculo: " + getModelo() + "\nPeso do veiculo: " + getPeso()
				+ "\nQuantidade de portas: " + getQuantidadePortas() + "\nPeso do engate: " + getPesoEngate());
	}
	
	public double retornarPesoTotal() {
		double pesoTotal = getPesoEngate() + getPeso();
		return pesoTotal;
	}
}
