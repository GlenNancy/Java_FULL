package br.com.aulatresprojetopoo.model;

public class Funcionario extends Pessoa{
	
	private double salario;
	private String setor;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
}
