package br.com.construtora.model;

public class Casa extends Residencia {

	private String tipoTelhado;

	public String getTipoTelhado() {
		return tipoTelhado;
	}

	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}

	public void mostrarAtributos() {
		System.out.println("Nome: " + getNome() + "\nMetros quadrados contruidos: " + getMetrosQuadradosConstruido()
				+ "\nMetros quadrados do terreno: " + getMetrosQuadradosTerreno() + "\nTipo de telhado: " + getTipoTelhado());
	}
	
	public double areaNaoConstruida() {
		double areaNaoConstruida = getMetrosQuadradosTerreno() - getMetrosQuadradosConstruido();
		return areaNaoConstruida;
	}
}
