package br.com.fiapcompra.model;

public class Carrinho extends Brinquedo {
    private int nivelBateria;
    private boolean ligado;

    public Carrinho(String nome, String cor, double preco) {
        super(nome, cor, preco);
        this.nivelBateria = 100;
        this.ligado = false;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        if (this.nivelBateria <= 0) {
            System.out.println(this.nome + " está sem bateria e não pode ser ligado.");
            return;
        }
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O carrinho " + this.nome + " foi ligado com sucesso!");
        } else {
            System.out.println("O carrinho " + this.nome + " já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado){
            this.ligado = false;
            System.out.println("O carrinho " + this.nome + " foi desligado com sucesso!");
        } else {
            System.out.println("O carrinho " + this.nome + " já está desligado.");
        }
    }

    public void carregarBateria() {
        if (this.nivelBateria < 100) {
            this.nivelBateria = 100;
            System.out.println(this.nome + " teve a bateria recarregada. Nível: " + this.nivelBateria + "%.");
        } else {
            System.out.println(this.nome + " já está com a bateria cheia.");
        }
    }
    public void dirigir() {
        if (this.ligado) {
            if (this.nivelBateria > 0) {
                System.out.println("Dirigindo o carrinho " + this.nome + "! Bateria: " + this.nivelBateria + "%.");
                this.nivelBateria -= 5;
            } else {
                System.out.println("O carrinho " + this.nome + " está sem bateria e não pode dirigir.");
            }
        } else {
            System.out.println("O carrinho " + this.nome + " está desligado. Ligue-o para dirigir.");
        }
    }

}