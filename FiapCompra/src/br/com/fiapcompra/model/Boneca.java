package br.com.fiapcompra.model;

public class Boneca extends Brinquedo {
    private String acessorio;

    public Boneca(String nome, String cor, double preco) {
        super(nome, cor, preco); 
        this.acessorio = "Nenhum";
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void adicionarAcessorio(String novoAcessorio) {
        if (novoAcessorio != null && !novoAcessorio.trim().isEmpty()) {
            this.acessorio = novoAcessorio;
            System.out.println(this.nome + " agora tem o acessório: " + novoAcessorio + "!");
        } else {
            System.out.println("Erro: O espaço deve ser preenchido com ao menos um caracter válido.");
        }
    }

    public void removerAcessorio() {
        this.acessorio = "Nenhum";
        System.out.println("O acessório de " + this.nome + " foi removido.");
    }

    public void abracar() {
        System.out.println("Você está abraçando o(a) " + this.nome + " fofinha");
        if (!this.acessorio.equals("Nenhum")) {
            System.out.println("Ele(a) está usando um(a) " + this.acessorio + ".");
        }
    }

}