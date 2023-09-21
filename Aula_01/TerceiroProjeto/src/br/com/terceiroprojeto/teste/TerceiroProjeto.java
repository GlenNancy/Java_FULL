package br.com.terceiroprojeto.teste;

public class TerceiroProjeto {

	public static void main(String[] args) {
		
		String teste = "37";
		String testeDois = "20";
		String testeResultado = teste + testeDois;
		
		System.out.println(testeResultado);
		
		String testeTres = "37";
		String testeQuatro = "20";
		int testeTresConvertido = Integer.parseInt(testeTres);
		int testeQuatroConvertido = Integer.parseInt(testeQuatro);
		int testeResultadoDois = testeTresConvertido + testeQuatroConvertido;
		
		System.out.println(testeResultadoDois);
	}

}
