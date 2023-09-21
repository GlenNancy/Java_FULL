package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Funcionario funcionario = new Funcionario();
		Professor professor = new Professor();
		
		//aluno.setNome("Yago");
		//Integer.parseInt();
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno: ")));
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno: ")));
		
		System.out.println("\nNome do aluno: " + aluno.getNome() + "\nIdade do aluno: " + aluno.getIdade() + 
				"\nRm do aluno: " + aluno.getRm());
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario: ")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: ")));
		funcionario.setSetor(JOptionPane.showInputDialog("Digite o setor do funcionario: "));
		
		System.out.println("\nNome do funcionario: " + funcionario.getNome() + "\nIdade do funcionario: " + funcionario.getIdade() + 
				"\nsalario do funcionario: " + funcionario.getSalario() + "\nSetor do Funcionario: " + funcionario.getSetor());
		
		professor.setNome(JOptionPane.showInputDialog("Digite o nome do professor: "));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor: ")));
		professor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor: ")));
		professor.setMateria(JOptionPane.showInputDialog("Digite a materia do professor: "));
		
		System.out.println("\nNome do professor: " + professor.getNome() + "\nIdade do professor: " + professor.getIdade() + 
				"\nsalario do professor: " + professor.getSalario() + "\nMateria do Professor: " + professor.getMateria());

	}

}
