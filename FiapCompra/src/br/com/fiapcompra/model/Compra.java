package br.com.fiapcompra.model;

public class Compra {
    private double metodoPagamento;

    private Brinquedo produto;
    private Cliente comprador;

    public Compra(double metodoPagamento, Brinquedo produto, Cliente comprador){
        this.metodoPagamento = metodoPagamento;
        this.produto = produto;
        this.comprador = comprador;
    }

    public void exibirInformacoes() {
        System.out.println("\n───> INFORMAÇÕES DA COMPRA <───");
        System.out.println("Cliente: " + this.comprador.getNome() + " | " + this.comprador.getCpf() + ".");
        System.out.println("Produto: " + this.produto.getNome() + " | " + this.produto.getCor() + ".");
        System.out.println("Valor a pagar: " + this.produto.getPreco());
    }

    public double getMetodoPagamento(){
        return this.metodoPagamento;
    }
    public Brinquedo getProduto(){
        return this.produto;
    }
    public Cliente getComprador(){
        return this.comprador;
    }
}
