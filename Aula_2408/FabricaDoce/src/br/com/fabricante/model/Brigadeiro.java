package br.com.fabricante.model;

public class Brigadeiro extends Doce {

	private double pesoChocolate;

	public double getPesoChocolate() {
		return pesoChocolate;
	}

	public void setPesoChocolate(double pesoChocolate) {
		this.pesoChocolate = pesoChocolate;
	}

	public void retornarDadosString() {
		System.out.println("Nome do brigadeiro: " + getNomeDoce() + "\nPeso do açucar: " + getPesoAcucar()
		+ "\nPeso do chocolate:" + getPesoChocolate());
	}
	
	public String retornarDadosStringReturn() {
		return "Nome do brigadeiro: " + getNomeDoce() + "\nPeso do açucar: " + getPesoAcucar()
		+ "\nPeso do chocolate:" + getPesoChocolate(); 
	}
	
	public double retornarPesoTotal() {
		double pesoTotal = getPesoAcucar() + getPesoChocolate();
		return pesoTotal;
	}
}
