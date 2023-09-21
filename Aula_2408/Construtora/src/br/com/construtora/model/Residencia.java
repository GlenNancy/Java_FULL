package br.com.construtora.model;

public class Residencia {

	private String nome;
	private double metrosQuadradosConstruido;
	private double metrosQuadradosTerreno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMetrosQuadradosConstruido() {
		return metrosQuadradosConstruido;
	}
	public void setMetrosQuadradosConstruido(double metrosQuadradosConstruido) {
		this.metrosQuadradosConstruido = metrosQuadradosConstruido;
	}
	public double getMetrosQuadradosTerreno() {
		return metrosQuadradosTerreno;
	}
	public void setMetrosQuadradosTerreno(double metrosQuadradosTerreno) {
		this.metrosQuadradosTerreno = metrosQuadradosTerreno;
	}
}
