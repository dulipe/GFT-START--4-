package Exercicio3.Aplication;

import Exercicio3.Entities.Produto;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// Opera��o quando for true � aumento e quando for false � desconto
		
		Produto projetoJava = new Produto("Projeto com java", 1000f, false, 10f);
		Produto projetoNodeJS = new Produto("Projeto com node", 900f, true, 15f);
		Produto projetoPython = new Produto("Projeto com python", 500f, true, 16f);
		
		projetoJava.increaseOrDiscount();
		projetoNodeJS.increaseOrDiscount();
		projetoPython.increaseOrDiscount();
	}

}
