package br.com.fiapride.model;

public class Passageiro {
    public String nome;
    public String cpf;
    public double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de adição deve ser superior a zero.");

            return;
        }

        this.saldo += valor;
        System.out.println("Recarga realizada com sucesso! Seu novo saldo é R$" + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: Valor inválido. O custo da viagem deve ser superior a zero.");
            return;
        }

        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realização do pagamento. Valor necessário R$:" + custo + " . Saldo atual R$:" + this.saldo);
            return;
        }
        
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante R$:" + this.saldo);
    }
}