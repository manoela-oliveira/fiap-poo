package br.com.objeto.model;

public class GuardaChuva {
    private String cor;
    private String material;
    private double espacoOcupado;
    private boolean aberto;
    
    public GuardaChuva(String cor, String material){
        this.setCor(cor);
        this.setMaterial(material);
        this.espacoOcupado = 0.55;
        this.aberto = true;
    }

    public String getCor(){
        return this.cor;
    }

    private void setCor(String cor) {
        if (cor != null){
        this.cor = cor;
        }
        else{
            System.out.println("Erro: O espaço 'Cor' deve possuir ao menos 1 caracter válido");
        }
    }

    public String getMaterial(){
        return this.material;
    }

    private void setMaterial(String material) {
        if (material != null){
        this.material = material;
        }
        else{
            System.out.println("Erro: O espaço 'Cor' deve possuir ao menos 1 caracter válido");
        }
    }

    public double getEspacoOcupado(){
        return this.espacoOcupado;
    }

    public boolean getAberto(){
        return this.aberto;
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
            System.out.println("\nOops! Parece que o guarda-chuva " + cor + " já está fechado!");
            return;
        }

        this.aberto = false;
        this.espacoOcupado = 0.55;
        System.out.println("\nVocê fechou o guarda-chuva " + cor + ". Agora ele ocupa apenas " + espacoOcupado + "m.");
    }


}
