package br.com.vetorobjeto.teste;

import javax.swing.JOptionPane;

import br.com.vetorobjeto.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		 Aluno aluno = new Aluno();
		 
		 aluno.setIdade(30);
		 aluno.setNome("Yoongi");
		 aluno.setRm(201141);
		 
		 Aluno[] alunoVetor = new Aluno[3];
		 /*
		 alunoVetor[0] = new Aluno();
		 alunoVetor[0].setNome("Jungkook");
		 alunoVetor[0].setIdade(26);
		 alunoVetor[0].setRm(226512);
		*/
		 
		 
		 String nome = "";
		 int idade = 0;
		 int rm = 0;
		 
		 
		 for(int i=0; i<3; i= i +1) {
			 nome = JOptionPane.showInputDialog("Digite o nome");
			 idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			 rm = Integer.parseInt(JOptionPane.showInputDialog("Digite o rm"));
			 
			 alunoVetor[i] = new Aluno();
			 alunoVetor[i].setNome(nome);
			 alunoVetor[i].setIdade(idade);
			 alunoVetor[i].setRm(rm);
		 }
		 
		 for(int i=0; i<3; i= i +1) {
			 
			 System.out.println(alunoVetor[i].getNome() + " "
					 + alunoVetor[i].getIdade() + " " + alunoVetor[i].getRm() + "\n" 
					 );
			
			 
		 }
	}
	

}
