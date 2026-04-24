package br.com.fiapcompra.main;
import br.com.fiapcompra.model.Brinquedo;

public class SistemaPrincipal {
    public static void main(String[] args) {
    Brinquedo brinquedo1 = new Brinquedo("boneca", "rosa", 10.50);

    System.out.println("───> Sistema de Compra <───");
    System.out.println("\nO brinquedo escolhido é um(a) " + brinquedo1.getNome() + ". Sua cor é " + brinquedo1.getCor() + " e custa " + brinquedo1.getPreco() + ".");

    }
}
