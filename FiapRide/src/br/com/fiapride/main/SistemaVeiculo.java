package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;
// Alterando nomeclatura da classe a fim de facilitar identificação
public class SistemaVeiculo {
    
    public static void main(String[] args) {
        System.out.println("--- Sistema FiapRide ---");
        /* Instânciando objeto utilizando sistema de atributos do arquivo Veiculo.java e utilizando
           "new" para alocação de memória
           Utilizando nomeclatura significativa para  objeto
           De: v1
           Para: veiculo1 */
        Veiculo veiculo1 = new Veiculo("Carlos","ABC-123", "Red Bull RB17");
        System.out.println("\n>>>> Abastecimento do veículo do proprietário " + veiculo1.getProprietario() +".");
        veiculo1.adicionarGasolina(50.0);
        veiculo1.consumirGasolina(100);

        System.out.println("\n>>>> Status do veículo:");
        System.out.println("Proprietário: " + veiculo1.getProprietario() + " | Placa: " + veiculo1.getPlaca() + " | Modelo:" + veiculo1.getModelo() + " | Gasolina: " + veiculo1.getGasolina() + " litros");
    }
}
