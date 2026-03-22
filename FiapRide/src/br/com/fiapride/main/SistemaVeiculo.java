package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaVeiculo {
    
    public static void main(String[] args) {
        System.out.println("--- Sistema FiapRide ---");

        Veiculo veiculo1 = new Veiculo("Carlos","ABC-123");
        System.out.println("\n>>>> Abastecimento do veículo do proprietário " + veiculo1.getProprietario() +".");
        veiculo1.adicionarGasolina(50.0);
        veiculo1.consumirGasolina(100);

        System.out.println("\n>>>> Status do veículo:");
        System.out.println("Proprietário: " + veiculo1.getProprietario() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina() + "l");
    }
}
