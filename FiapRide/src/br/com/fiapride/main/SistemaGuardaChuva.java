package br.com.fiapride.main;

import br.com.fiapride.model.GuardaChuva;

public class SistemaGuardaChuva {
	public static void main(String[] args) {
		GuardaChuva meuGuardaChuva = new GuardaChuva("Vinho", "Poliéster");
		meuGuardaChuva.abrir();
		meuGuardaChuva.fechar();

		GuardaChuva GuardaChuvaDoProfessor = new GuardaChuva("Preto", "Plástico");
		GuardaChuvaDoProfessor.fechar();

		//System.out.println("--- Testes ---");
		//System.out.println("A cor do meu guarda-chuva é: " + meuGuardaChuva.cor);
		//System.out.println("A cor do guarda-chuva do professor é: " + GuardaChuvaDoProfessor.cor);

		//System.out.println(" ");
		//System.out.println("O material do meu guarda-chuva é: " + meuGuardaChuva.material);
		//System.out.println("O material do guarda-chuva do professor é: " + GuardaChuvaDoProfessor.material);


	}

}
