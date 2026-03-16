package br.com.fiapride.main;

import br.com.fiapride.model.GuardaChuva;

public class SistemaGuardaChuva {
	public static void main(String[] args) {
		GuardaChuva meuGuardaChuva = new GuardaChuva("Vinho", "Poliéster");
		meuGuardaChuva.abrir();
		meuGuardaChuva.fechar();

		GuardaChuva guardaChuvaDoProfessor = new GuardaChuva("Preto", "Plástico");
		guardaChuvaDoProfessor.fechar();

	}

}