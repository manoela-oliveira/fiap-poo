package br.com.fiapride.model;

public class GuardaChuva {
    public String cor;
    public String material;
    public double espacoOcupado;
    public boolean aberto;
    
    public GuardaChuva(String cor, String material){
        this.cor = cor;
        this.material = material;
        this.espacoOcupado = 0.50;
        this.aberto = false;
    }

    public void abrir() {
        if (this.aberto) {
            System.out.println("Oops! Parece que o guarda-chuva "  + cor + " já está aberto!");
            return;
        }

        this.aberto = true;
        this.espacoOcupado = 1.10;
        System.out.println("Você abriu o guarda-chuva " + cor + ". Agora ele ocupa um espaço de " + espacoOcupado + "m.");
    }

    public void fechar() {
        if (!this.aberto) {
            System.out.println("Oops! Parece que o guarda-chuva " + cor + " já está fechado!");
            return;
        }

        this.aberto = false;
        this.espacoOcupado = 0.55;
        System.out.println("Você fechou o guarda-chuva " + cor + ". Agora ele ocupa apenas " + espacoOcupado + "m.");
    }


}
