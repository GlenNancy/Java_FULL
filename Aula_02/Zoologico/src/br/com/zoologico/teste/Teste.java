package br.com.zoologico.teste;

import br.com.zoologico.model.Mamifero;
import br.com.zoologico.model.Reptil;

public class Teste {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome("jade");
		mamifero.setPeso(20.0);
		mamifero.setTempoGestacao(9);;
		
		System.out.println("Nome do mamifero: " + mamifero.getNome() + "\nPeso do mamifero: " + mamifero.getPeso() + 
				"\nTempo de gestação: " + mamifero.getTempoGestacao());
		
		Reptil reptil = new Reptil();
		
		reptil.setNome("Tartaruga");
		reptil.setPeso(15.2);
		reptil.setCorPrincipalPele("Verde Musgo");
		
		System.out.println("\nNome do reptil: " + reptil.getNome() + "\nPeso do reptil: " + reptil.getPeso() + 
				"\nCor principal da pele: " + reptil.getCorPrincipalPele());
	}

}
