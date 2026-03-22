package br.com.fiapride.main;

import br.com.fiapride.model.GuardaChuva;

public class SistemaGuardaChuva {
	public static void main(String[] args) {
		System.out.println("~~~ Sistema do Guarda-Chuva ~~~");

		GuardaChuva meuGuardaChuva = new GuardaChuva("vinho", "poliéster");
		System.out.println("\n>>>> Tentando abrir o guarda-chuva " + meuGuardaChuva.getCor());
		meuGuardaChuva.abrir();
		meuGuardaChuva.fechar();

		GuardaChuva guardaChuvaDoProfessor = new GuardaChuva("preto", "plástico");
		System.out.println("\n>>>> Tentando fechar o guarda-chuva " + guardaChuvaDoProfessor.getCor());
		guardaChuvaDoProfessor.fechar();

	}

}