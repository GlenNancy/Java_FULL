package br.com.aulatresprojetopoo.teste;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Maurício");
		aluno.setIdade(18);
		aluno.setRm(22226);
		
		System.out.println("\nNome do aluno: " + aluno.getNome() + "\nIdade do aluno: " + aluno.getIdade() + 
				"\nRm aluno: " + aluno.getRm());

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Antonio");
		funcionario.setIdade(24);
		funcionario.setSalario(1903.98);
		funcionario.setSetor("Limpeza");
		
		System.out.println("\nNome do funcionario: " + funcionario.getNome() + "\nIdade do funcionario: " + funcionario.getIdade() + 
				"\nsalario do funcionario: " + funcionario.getSalario() + "\nSetor do Funcionario: " + funcionario.getSetor());

		Professor professor = new Professor();

		professor.setNome("Veloso");
		professor.setIdade(36);
		professor.setSalario(5821.54);
		professor.setMateria("Algoritimo");
		
		System.out.println("\nNome do professor: " + professor.getNome() + "\nIdade do professor: " + professor.getIdade() + 
				"\nsalario do professor: " + professor.getSalario() + "\nMateria do Professor: " + professor.getMateria());
	}

}
