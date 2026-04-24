package br.com.objetoteste.model;

public class Capa { // Interprete como uma capa personalizada que será comprada para envolver o guarda-chuva
    private String estampa;
    private double precoCapa;
    private Dono comprador;
    
    public Capa(String estampa, double precoCapa, Dono comprador) {
        this.estampa = estampa;
        this.precoCapa = precoCapa;
        this.comprador = comprador;
    }

    public void exibirDetalhesCompra() {
        System.out.println("\n~~~~ Detalhes da compra");
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Estampa escolhida: " + this.estampa);
        System.out.println("Valor a pagar: " + this.precoCapa);
    }

    public String getEstampa() { return this.estampa; }
    public double getPrecoCapa() { return this.precoCapa; }
    public Dono getComprador() { return this.comprador; }

}
