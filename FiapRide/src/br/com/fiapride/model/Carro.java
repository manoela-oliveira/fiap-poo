package br.com.fiapride.model;

public class Carro extends Veiculo {
    private int capacidadePassageiros;

    public Carro(String proprietario, String placa, String modelo, int capacidadePassageiros) {
        super(proprietario, placa, modelo);
        this.setCapacidadePassageiros(capacidadePassageiros);
    }

 public int getCapacidadePassageiros() {
     return this.capacidadePassageiros;
 }

 private void setCapacidadePassageiros(int capacidadePassageiros) {
     this.capacidadePassageiros = capacidadePassageiros;
 }
}