package br.com.fabricante.teste;

import br.com.fabricante.model.Brigadeiro;

public class Teste {

	public static void main(String[] args) {

		Brigadeiro brigadeiro = new Brigadeiro();

		brigadeiro.setNomeDoce("Brigadeiro da vovó");
		brigadeiro.setPesoAcucar(100);
		brigadeiro.setPesoChocolate(700);

		brigadeiro.retornarDadosString();
		
		System.out.println(brigadeiro.retornarDadosStringReturn());
		
		System.out.println("\nPeso total: " + brigadeiro.retornarPesoTotal());
	}

}
