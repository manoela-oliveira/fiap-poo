package br.com.fiapride.model;

public class GuardaChuva {
    public String cor;
    public String material;
    public boolean aberto;
    
    public GuardaChuva(String cor, String material){
        this.cor = cor;
        this.material = material;
        this.aberto = false;
    }

    public void abrir() {
        if (this.aberto) {
            System.out.println("Oops! Parece que o guarda-chuva "  + cor + " já está aberto!");
            return;
        }

        this.aberto = true;
        System.out.println("Você abriu o guarda-chuva " + cor + ".");
    }

    public void fechar() {
        if (!this.aberto) {
            System.out.println("Oops! Parece que o guarda-chuva " + cor + " já está fechado!");
            return;
        }

        this.aberto = false;
        System.out.println("Você fechou o guarda-chuva " + cor + ".");
    }
}
