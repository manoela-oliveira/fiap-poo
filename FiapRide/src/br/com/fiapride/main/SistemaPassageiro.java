package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPassageiro {
	public static void main(String[] args) {
		System.out.println("--- Sistema FiapRide ---");

		Passageiro passageiro1 = new Passageiro("Ana Silva","222.222.222-22");
		System.out.println("\n>>>> Recarga do passageiro " + passageiro1.getNome() +".");
		passageiro1.adicionarSaldo(50.0);
		   
		Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
		System.out.println("\n>>>> Recarga do passageiro " + passageiro2.getNome()+".");
		passageiro2.adicionarSaldo(12.5);

		System.out.println("\n Status dos passageiros:");

		System.out.println("\n Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
		System.out.println(" Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

		System.out.println("\n --- Hora dos pagamentos ---");
		System.out.println("\nPagando viagem do passageiro " + passageiro1.getNome() +".");
		passageiro1.pagarViagem(20);
		System.out.println("\nPagando viagem do passageiro " + passageiro2.getNome() +".");
		passageiro2.pagarViagem(20);

	}
}