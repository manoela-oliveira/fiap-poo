package br.com.fiapcompra.model;

public class Brinquedo { // Não é mais abstrata
    protected String nome;
    protected String cor;
    protected double preco;
    // O atributo 'ligado' será removido daqui e ficará apenas em BrinquedoEletronico
    // Para simplificar e não precisar de protected/setters complexos sem @Override.

    // Construtor principal para atributos comuns a TODOS os brinquedos (3 parâmetros)
    public Brinquedo(String nome, String cor, double preco){
        this.setNome(nome);
        this.setCor(cor);
        this.setPreco(preco);
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    public String getCor(){
        return this.cor;
    }
    public double getPreco(){
        return this.preco;
    }

    // Setters (mantidos privados)
    private void setNome(String nome){
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }
        else{
            System.out.println("Erro: O espaço 'nome' deve possuir ao menos 1 caracter válido");
        }
    }
    private void setCor(String cor){
        if (cor != null && !cor.trim().isEmpty()){
            this.cor = cor;
        }
        else{
            System.out.println("Erro: O espaço 'cor' deve possuir ao menos 1 caracter válido");
        }
    }
    private void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        }
        else{
            System.out.println("Erro: valor inválido! Não possuímos nenhum item gratuito na loja. Por favor, preencher o campo 'preço' com algum valor acima de 0.");
        }
    }

    // Método genérico de interação (não é abstrato, não usa @Override)
    public void interagir() {
        System.out.println("Interagindo com o brinquedo " + this.nome + ".");
    }

    // Métodos para ligar/desligar não existem aqui, pois não são para todo brinquedo
    // A verificação 'ehEletronico()' também será removida da base.
}