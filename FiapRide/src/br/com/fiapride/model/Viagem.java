package br.com.fiapride.model;
/* Criando um relacionamento, vulgo associação, vulgo Has-A
A classe Viagem ao invés de possuir apenas atributos simples,
possui também outros objetos dentro dela */

public class Viagem {
    // Atributo simples
    private String destino;
    private double valor;

    // Atributo de associação
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0;

        System.out.println("Nova viagem solicitada para: " + this.destino);
    }

    public void exibirResumo() {
        System.out.println("\n>>> RESUMO DA VIAGEM <<<");
        System.out.println("Destino: " + this.destino);
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veículo: " + this.veiculoUtilizado.getModelo() + " (Placa: " + this.veiculoUtilizado.getPlaca() + ")");
    }

    public String getDestino() { return this.destino; }
    public Passageiro getSolicitante() { return this.solicitante; }
    public Veiculo getVeiculoUtilizado() { return this.veiculoUtilizado; }
}

