package br.com.aulatresprojetoum.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		// Integer.parseInt(idade)
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		// Double.parseDouble(salario)
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		System.out.println("Seu nome é " + nome);
		System.out.println("Sua idade é " + idade);
		System.out.println("Seu salário é " + salario);

	}

}
