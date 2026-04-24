package br.com.fiapcompra.model;

public class Comprador {
    private String nome;
    private String cpf;
    private double saldo;

    public Comprador(String nome, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.saldo = 0.0;
    }

    public String getNome(){
        return this.nome;
    }

    private void setNome(String nome){
        if (nome != null){
            this.nome = nome;
        }
        else{
            System.out.println("Erro: O espaço 'nome' deve possuir ao menos 1 caracter válido");
        }
    }

    public String getCpf(){
        return this.cpf;
    }

    private void setCpf(String cpf){
        if (cpf != null && cpf.length() >= 11){
            this.cpf = cpf;
        }
        else{
            System.out.println("Erro: Tentativa de definir valor inválido como CPF.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    private void setSaldo(double valor){
        if (valor >= 0){
            this.saldo = valor;
        }
        else {
            System.out.println("Erro: Tentativa de definir saldo negativo bloqueada!");
        }
    }



    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de adição deve ser superior a zero.");

            return;
        }

        this.saldo += valor;
        System.out.println("Recarga realizada com sucesso! Seu novo saldo é R$" + this.saldo);
    }

    public void realizarCompra(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: Valor inválido. O custo da compra deve ser superior a zero.");
            return;
        }

        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para a realização do pagamento. Valor necessário R$:" + custo + " . Saldo atual R$:" + this.saldo);
            return;
        }
        
        this.saldo -= custo;
        System.out.println("Compra realizada com sucesso! Saldo restante R$:" + this.saldo);
    }

}
