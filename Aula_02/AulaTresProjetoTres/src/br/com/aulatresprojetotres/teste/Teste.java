package br.com.aulatresprojetotres.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idadePai = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Pai: "));
		int idadeFilho = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Filho: "));

		double media = (idadePai + idadeFilho)/ 2;  
		
		
		if (media >= 50)
		{
			System.out.println("Com certeza seu filho é maior de idade");
		}
		else
		{
			System.out.println("Talvez o filho é menor de idade");
		}
	}

}
