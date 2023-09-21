package br.com.fabricaveiculo.teste;

import br.com.fabricaveiculo.model.Carro;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro();

		carro.setModelo("Ferrari");
		carro.setPeso(1500);
		carro.setQuantidadePortas(4);
		carro.setPesoEngate(150);

		carro.mostrarAtributos();
		System.out.println(carro.retornarPesoTotal());
	}

}
