package br.com.objeto.model;

public class Dono {
    private String nome;
    private String turma;
    private double saldo;

    public Dono(String nome, String turma) {
        this.setNome(nome);
        this.setTurma(turma);
        this.setSaldo(0.0);

        System.out.println("Este guarda-chuva pertence a " + this.nome + ", da turma " + this.turma + ".");
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
        else {
            System.out.println("Por favor, informe o nome do dono do guarda-chuva corretamente. Vai que ele perde! Precisamos conseguir identificá-lo.");
        }
    }

    public String getTurma() {
        return this.turma;
    }

    private void setTurma(String turma) {
        if (turma != null) {
            this.turma = turma;
        }
        else{
            System.out.println("Por favor, informe a  turma do dono do guarda-chuva corretamente. Vai que ele perde! Precisamos saber onde procurá-lo.");
        }
    }

    public double getSaldo() {
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

    public void comprarCapa(Capa capa) {
        double custo = capa.getPrecoCapa();
        if (custo <= 0) {
            System.out.println("Erro: Valor inválido.");
            return;
        }
        
        if (this.saldo < custo) {
            System.out.println("Parece que você não tem dinheiro o suficiente. Necessário: R$" + custo + " | Atual: R$" + this.saldo);
            return;
        }
        
        this.saldo -= custo;

        System.out.println("Compra realizada com sucesso! Você escolheu a capa personalizada com estampa de " + capa.getEstampa());
        System.out.println("Saldo restante: R$" + this.saldo);
}

}
