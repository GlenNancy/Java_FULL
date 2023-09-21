package br.com.construtora.model;

public class Casa extends Residencia {

	private double tamanhoPortaoMetrosQuadrados;

	public double getTamanhoPortaoMetrosQuadrados() {
		return tamanhoPortaoMetrosQuadrados;
	}

	public void setTamanhoPortaoMetrosQuadrados(double tamanhoPortaoMetrosQuadrados) {
		this.tamanhoPortaoMetrosQuadrados = tamanhoPortaoMetrosQuadrados;
	}

	public String MostrarAtributos() {
		return "Metros Quadrados: " + getMetrosQuadrado() + "\ntamanho do Portão: " + getTamanhoPortaoMetrosQuadrados();
	}

}
